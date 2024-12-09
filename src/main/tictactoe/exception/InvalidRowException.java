package main.tictactoe.exception;

public class InvalidRowException extends RuntimeException{
    public InvalidRowException(String message) {
        super(message);
    }
}
