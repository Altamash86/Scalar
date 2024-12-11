package main.parlkingLot.service.startegy.slotAllocationStrategy;

import main.parlkingLot.models.Gate;
import main.parlkingLot.models.ParkingLot;
import main.parlkingLot.models.Vehicle;

public interface SlotAllocationStrategy {
    ParkingLot getParkingLot(Vehicle vehicle, ParkingLot parkingLot, Gate entryGate);
}
