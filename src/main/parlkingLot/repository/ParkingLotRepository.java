package main.parlkingLot.repository;

import main.parlkingLot.exceptions.ParkingLotNotFoundException;
import main.parlkingLot.models.ParkingLot;

import java.util.HashMap;

public class ParkingLotRepository {
    private HashMap<Integer, ParkingLot> parkingLotMap;

    public ParkingLotRepository() {
        this.parkingLotMap = new HashMap<>();
    }

    public ParkingLot get(int parkingLotId){
        if(parkingLotMap.get(parkingLotId)==null){
            throw new ParkingLotNotFoundException("ParkingLot Not found for ParkingLotId: "+parkingLotId);
        }
        return parkingLotMap.get(parkingLotId);
    }

    public ParkingLot put(ParkingLot ParkingLot){
        parkingLotMap.put(ParkingLot.getId(),ParkingLot);
        return ParkingLot;
    }
}
