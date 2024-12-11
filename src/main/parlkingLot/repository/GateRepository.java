package main.parlkingLot.repository;

import main.parlkingLot.exceptions.GateNotFoundException;
import main.parlkingLot.models.Gate;

import java.util.HashMap;

public class GateRepository {
    private HashMap<Integer, Gate> gatesMap;

    public GateRepository() {
        this.gatesMap = new HashMap<>();
    }

    public Gate get(int gateId){
        if(gatesMap.get(gateId)==null){
            throw new GateNotFoundException("Gate Not found for gateId: "+gateId);
        }
        return gatesMap.get(gateId);
    }

    public Gate put(Gate gate){
        gatesMap.put(gate.getId(),gate);
        return gate;
    }
}
