package main.tictactoe.exception;

public class InvalidColumnException extends RuntimeException{
    public InvalidColumnException(String message) {
        super(message);
    }
}
