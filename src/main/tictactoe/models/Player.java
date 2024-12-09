package main.tictactoe.models;

import main.tictactoe.exception.InvalidColumnException;
import main.tictactoe.exception.InvalidRowException;

import java.util.Scanner;

public class Player {
    private int id;
    private String name;
    private char symbol;
    private PlayerType playerType;

    public Player(int id, String name, char symbol, PlayerType playerType) {
        this.id = id;
        this.name = name;
        this.symbol = symbol;
        this.playerType = playerType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSymbol() {
        return symbol;
    }

    public void setSymbol(char symbol) {
        this.symbol = symbol;
    }

    public PlayerType getPlayerType() {
        return playerType;
    }

    public void setPlayerType(PlayerType playerType) {
        this.playerType = playerType;
    }

    public Move makeMove(Board currentBoard, int dimension) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row: ");
        int row = sc.nextInt();
        System.out.println("Enter col: ");
        int col = sc.nextInt();

        if(row>dimension-1){
            throw new InvalidRowException("Invalid Row number selected: "+row);
        }
        if(col>dimension-1){
            throw new InvalidColumnException("Invalid Column number selected: "+col);
        }

        if(currentBoard.getBoard().get(row).get(col).getCellState().equals(CellState.FILLED)){
            System.out.println("Cell is already filled, pls use different cell");
            this.makeMove(currentBoard,dimension);
        }
        else{
            currentBoard.getBoard().get(row).get(col).setPlayer(this);
            currentBoard.getBoard().get(row).get(col).setCellState(CellState.FILLED);
        }
        return new Move(row,col,this);
    }
}
