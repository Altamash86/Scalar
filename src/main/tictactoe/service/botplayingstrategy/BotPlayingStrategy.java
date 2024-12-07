package main.tictactoe.service.botplayingstrategy;

import main.tictactoe.models.Board;
import main.tictactoe.models.Move;
import main.tictactoe.models.Player;

public interface BotPlayingStrategy {
    Move makeMove(Board board, Player player);
}
