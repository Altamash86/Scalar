package main.parlkingLot.repository;

import main.parlkingLot.exceptions.ParkingFloorNotFoundException;
import main.parlkingLot.models.ParkingFloor;

import java.util.HashMap;

public class ParkingFloorRepository {
    private HashMap<Integer, ParkingFloor> parkingLotMap;

    public ParkingFloorRepository() {
        this.parkingLotMap = new HashMap<>();
    }

    public ParkingFloor get(int ParkingFloorId){
        if(parkingLotMap.get(ParkingFloorId)==null){
            throw new ParkingFloorNotFoundException("ParkingFloor Not found for ParkingLotId: "+ParkingFloorId);
        }
        return parkingLotMap.get(ParkingFloorId);
    }

    public ParkingFloor put(ParkingFloor parkingFloor){
        parkingLotMap.put(parkingFloor.getId(),parkingFloor);
        return parkingFloor;
    }
}
