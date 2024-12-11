package main.parlkingLot.models;

import java.util.List;

public class ParkingFloor extends BaseModels{
    private int floorNumber;
    List<ParkingSlot> parkingSlots;
    List<Gate> gates;
    private ParkingFloorStatus parkingFloorStatus;
}
