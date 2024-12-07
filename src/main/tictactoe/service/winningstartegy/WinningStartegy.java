package main.tictactoe.service.winningstartegy;

import main.tictactoe.models.Board;
import main.tictactoe.models.Move;
import main.tictactoe.models.Player;

public interface WinningStartegy {
    Player checkWinner(Board board, Move move);
}
