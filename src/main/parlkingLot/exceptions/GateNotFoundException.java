package main.parlkingLot.exceptions;

public class GateNotFoundException extends RuntimeException{
    public GateNotFoundException(String message) {
        super(message);
    }
}
