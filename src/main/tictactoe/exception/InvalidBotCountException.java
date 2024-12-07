package main.tictactoe.exception;

public class InvalidBotCountException extends RuntimeException{
    public InvalidBotCountException(String message) {
        super(message);
    }
}
