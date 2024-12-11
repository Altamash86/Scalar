package main.parlkingLot.exceptions;

public class ParkingSlotNotFoundException extends RuntimeException{
    public ParkingSlotNotFoundException(String message) {
        super(message);
    }
}
