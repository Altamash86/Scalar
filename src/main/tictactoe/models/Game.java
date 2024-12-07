package main.tictactoe.models;

import main.tictactoe.exception.DuplicateSymbolException;
import main.tictactoe.exception.InvalidBoardSizeException;
import main.tictactoe.exception.InvalidBotCountException;
import main.tictactoe.exception.InvalidNumberOfPlayers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class Game {
    private Board currentBoard;
    private List<Player> players;
    private Player currentPlayer;
    private GameStatus gameStatus;
    private Player winner;
    private List<Move> moves;
    private List<Board> boardStates;
    private WinningStrategy winningStrategy;

    public Game(Board currentBoard, List<Player> players, WinningStrategy winningStrategy) {
        this.currentBoard = currentBoard;
        this.players = players;
        this.gameStatus = GameStatus.IN_PROGRESS;
        this.moves = new ArrayList<>();
        this.boardStates = new ArrayList<>();
        this.winningStrategy = winningStrategy;
    }

    public static Builder builder(){
        return new Builder();
    }

    public static class Builder{

        private int dimension;
        private List<Player> players;
        private WinningStrategy winningStrategy;

        public Builder dimension(int dimension) {
            this.dimension = dimension;
            return this;
        }

        public Builder players(List<Player> players) {
            this.players = players;
            return this;
        }

        public Builder winningStrategy(WinningStrategy winningStrategy) {
            this.winningStrategy = winningStrategy;
            return this;
        }

        public void validateBoardSize(){
            if(dimension < 3 || dimension > 10){
                throw new InvalidBoardSizeException("Board size should be greater than 3 or less than 10: "+dimension);
            }
        }

        public void validatePlayers(){
            int botCount = 0;
            for(Player p : players){
                if(p.getPlayerType().equals(PlayerType.BOT)){
                    botCount++;
                }
            }
            if(botCount > 1){
                throw new InvalidBotCountException("Bot Count is greater than 1, current count: " + botCount);
            }
        }

        public void validateNumberOfPlayers() {
            if(players.size() != dimension - 1 ){
                throw new InvalidNumberOfPlayers("Wrong number of Players: " + players.size());
            }
        }

        public void validateDuplicatePlayerSymbol(){
            HashSet<Character> hs = new HashSet<>();
            for(Player p : players){
                hs.add(p.getSymbol());
            }
            if(players.size() != hs.size()){
                throw new DuplicateSymbolException("Found Duplicate Symbol");
            }
        }

        public void validate(){
            validateBoardSize();
            validatePlayers();
            validateDuplicatePlayerSymbol();
            validateNumberOfPlayers();
        }

        public Game build(){
            validate();
            return new Game(new Board(dimension),players,winningStrategy);
        }
    }
}
