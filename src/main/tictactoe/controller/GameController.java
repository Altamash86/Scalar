package main.tictactoe.controller;

import main.tictactoe.models.*;
import main.tictactoe.service.winningstartegy.WinningStrategies;
import main.tictactoe.service.winningstartegy.WinningStrategyFactory;

import java.util.List;

public class GameController {
    public Game creatGame(int dimension, List<Player> players, WinningStrategies winningStrategies) {
        try {
            return Game.builder().
                    dimension(dimension)
                    .players(players)
                    .winningStrategy(WinningStrategyFactory.getWinningStrategy(winningStrategies, dimension))
                    .build();
        }
        catch (Exception e){
            System.out.println("Error: "+e.getMessage());
        }
        return null;
    }

    public void displayBoard(Game game) {
        game.getCurrentBoard().printBoard();
    }

    public Move executeMove(Game game, Player player) {
        Move move = player.makeMove(game.getCurrentBoard());
        game.setNoOfSymbols(game.getNoOfSymbols() + 1);
        updateGameStatus(game);
        updateGameMoves(game,move);
        updateBoardStates(game);
        return move;
    }

    public void updateBoardStates(Game game) {
        game.getBoardStates().add(game.getCurrentBoard().clone());
    }

    private void updateGameMoves(Game game, Move move) {
        game.getMoves().add(move);
    }

    private void updateGameStatus(Game game) {
        int noOfSymbols = game.getNoOfSymbols();
        int dimension = game.getCurrentBoard().getSize();
        if(noOfSymbols==dimension*dimension){
            game.setGameStatus(GameStatus.DRAW);
        }
    }

    public Player checkWinner(Game game, Move move) {
        Player player = game.getWinningStrategy().checkWinner(game.getCurrentBoard(),move);
        if(player != null){
            game.setWinner(player);
            game.setGameStatus(GameStatus.COMPLETED);
            return player;
        }
        return null;
    }

    public void gameReplay(Game game){
        for(Board b : game.getBoardStates()){
            System.out.println("--------------------");
            b.printBoard();
        }
    }
}
