package main.tictactoe.service.botplayingstrategy;

import main.tictactoe.exception.GameOverException;
import main.tictactoe.models.*;

import java.util.List;

public class RandomBotPlayingStrategy implements BotPlayingStrategy{
    @Override
    public Move makeMove(Board board, Player player) {
        List<List<Cell>> matrix = board.getBoard();
        for(int i=0;i<matrix.size();i++){
            for(int j=0;j<matrix.size();j++){
                if(matrix.get(i).get(j).getCellState().equals(CellState.EMPTY)){
                    matrix.get(i).get(j).setPlayer(player);
                    matrix.get(i).get(j).setCellState(CellState.FILLED);
                    return new Move(i,j);
                }
            }
        }
        throw new GameOverException("Game Over!!");
    }
}
