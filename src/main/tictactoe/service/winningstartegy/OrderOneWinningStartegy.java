package main.tictactoe.service.winningstartegy;

import main.tictactoe.models.Board;
import main.tictactoe.models.Move;
import main.tictactoe.models.Player;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class OrderOneWinningStartegy implements WinningStartegy{

    private int dimension;

    private List<HashMap<Character,Integer>> rowHashMaps;
    private List<HashMap<Character,Integer>> colHashMaps;
    private HashMap<Character,Integer> topLeftDiagonalHashMap;
    private HashMap<Character,Integer> topRightDiagonalHashMap;
    private HashMap<Character,Integer> cornerHashMap;

    public OrderOneWinningStartegy(int dimension) {
        this.dimension = dimension;
        rowHashMaps = new ArrayList<>();
        colHashMaps = new ArrayList<>();
        topLeftDiagonalHashMap = new HashMap<>();
        topRightDiagonalHashMap = new HashMap<>();
        cornerHashMap = new HashMap<>();

        for(int i=0;i<dimension;i++){
            rowHashMaps.add(new HashMap<>());
            colHashMaps.add(new HashMap<>());
        }
    }

    private boolean isTopLeftDiagonalCell(int row, int col){
        return row==col;
    }

    private boolean isTopRightDiagonalCell(int row, int col){
        return (row+col)==(dimension-1);
    }

    private boolean isCornerCell(int row, int col){
        if(row == 0 || row == dimension-1)
            return col==0 || col==dimension-1;
        return false;
    }

    private boolean checkRowWin(int row, char symbol){
        rowHashMaps.get(row).put(symbol,rowHashMaps.get(row).getOrDefault(symbol,0)+1);
        return rowHashMaps.get(row).get(symbol)==dimension;
    }

    private boolean checkColWin(int col, char symbol){
        colHashMaps.get(col).put(symbol,colHashMaps.get(col).getOrDefault(symbol,0)+1);
        return colHashMaps.get(col).get(symbol)==dimension;
    }

    private boolean checkTopLeftDiagonalWin(char symbol){
        topLeftDiagonalHashMap.put(symbol,topLeftDiagonalHashMap.getOrDefault(symbol,0)+1);
        return topLeftDiagonalHashMap.get(symbol)==dimension;
    }

    private boolean checkTopRightDiagonalWin(char symbol){
        topRightDiagonalHashMap.put(symbol,topRightDiagonalHashMap.getOrDefault(symbol,0)+1);
        return topRightDiagonalHashMap.get(symbol)==dimension;
    }

    private boolean checkCornerWin(char symbol){
        cornerHashMap.put(symbol,cornerHashMap.getOrDefault(symbol,0)+1);
        return cornerHashMap.get(symbol)==dimension;
    }



    @Override
    public Player checkWinner(Board board, Move lastMove) {
        Player player = lastMove.getPlayer();
        char symbol = player.getSymbol();
        int row = lastMove.getCell().getRow();
        int col = lastMove.getCell().getCol();

        if(checkRowWin(row, symbol))
            return player;
        else if(checkColWin(col, symbol))
            return player;
        else if(isTopLeftDiagonalCell(row, col) && checkTopLeftDiagonalWin(symbol))
            return player;
        else if(isTopRightDiagonalCell(row, col) && checkTopRightDiagonalWin(symbol))
            return player;
        else if(isCornerCell(row, col) &&  checkCornerWin(symbol))
            return player;
        return null;
    }
}
