package main.tictactoe.exception;

public class GameOverException extends RuntimeException {
    public GameOverException(String message) {
        super(message);
    }
}
