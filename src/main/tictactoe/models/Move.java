package main.tictactoe.models;

public class Move {
    private Player player;
    private Cell cell;

    public Move(int row, int col) {
        this.cell = new Cell(row,col);
    }

    public Move(int i, int j, Player player) {
        this.player = player;
        this.cell = new Cell(i,j);
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Cell getCell() {
        return cell;
    }

    public void setCell(Cell cell) {
        this.cell = cell;
    }
}
