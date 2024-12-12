package main.parlkingLot.models;

import main.parlkingLot.models.constant.ParkingFloorStatus;

import java.util.List;

public class ParkingFloor extends BaseModels{
    private int floorNumber;
    private List<ParkingSlot> parkingSlots;
    private List<Gate> gates;
    private ParkingFloorStatus parkingFloorStatus;

    public ParkingFloor(int id) {
        super(id);
    }


    public int getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
    }

    public List<ParkingSlot> getParkingSlots() {
        return parkingSlots;
    }

    public void setParkingSlots(List<ParkingSlot> parkingSlots) {
        this.parkingSlots = parkingSlots;
    }

    public List<Gate> getGates() {
        return gates;
    }

    public void setGates(List<Gate> gates) {
        this.gates = gates;
    }

    public ParkingFloorStatus getParkingFloorStatus() {
        return parkingFloorStatus;
    }

    public void setParkingFloorStatus(ParkingFloorStatus parkingFloorStatus) {
        this.parkingFloorStatus = parkingFloorStatus;
    }
}
