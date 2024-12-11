package main.parlkingLot.exceptions;

public class ParkingFloorNotFoundException extends RuntimeException{
    public ParkingFloorNotFoundException(String message) {
        super(message);
    }
}
