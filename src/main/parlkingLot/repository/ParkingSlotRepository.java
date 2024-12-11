package main.parlkingLot.repository;

import main.parlkingLot.exceptions.ParkingSlotNotFoundException;
import main.parlkingLot.models.ParkingSlot;

import java.util.HashMap;

public class ParkingSlotRepository {
    private HashMap<Integer, ParkingSlot> parkingSlotMap;

    public ParkingSlotRepository() {
        this.parkingSlotMap = new HashMap<>();
    }

    public ParkingSlot get(int ParkingSlotId){
        if(parkingSlotMap.get(ParkingSlotId)==null){
            throw new ParkingSlotNotFoundException("ParkingSlot Not found for ParkingSlotId: "+ParkingSlotId);
        }
        return parkingSlotMap.get(ParkingSlotId);
    }

    public ParkingSlot put(ParkingSlot ParkingSlot){
        parkingSlotMap.put(ParkingSlot.getId(),ParkingSlot);
        return ParkingSlot;
    }
}
