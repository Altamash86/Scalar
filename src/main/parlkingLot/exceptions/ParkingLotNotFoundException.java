package main.parlkingLot.exceptions;

public class ParkingLotNotFoundException extends RuntimeException{
    public ParkingLotNotFoundException(String message) {
        super(message);
    }
}
