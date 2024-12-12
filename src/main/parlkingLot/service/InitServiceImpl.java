package main.parlkingLot.service;

import main.parlkingLot.models.Gate;
import main.parlkingLot.models.ParkingFloor;
import main.parlkingLot.models.ParkingLot;
import main.parlkingLot.models.ParkingSlot;
import main.parlkingLot.models.constant.*;
import main.parlkingLot.repository.*;
import main.parlkingLot.service.startegy.billCalculationStrategy.BillCalculationStrategyFactory;
import main.parlkingLot.service.startegy.slotAllocationStrategy.SlotAllocationStrategyFactory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InitServiceImpl implements InitService{

    private final GateRepository gateRepository;
    private final ParkingFloorRepository parkingFloorRepository;
    private final ParkingLotRepository parkingLotRepository;
    private final ParkingSlotRepository parkingSlotRepository;

    public InitServiceImpl(GateRepository gateRepository, ParkingFloorRepository parkingFloorRepository, ParkingLotRepository parkingLotRepository, ParkingSlotRepository parkingSlotRepository) {
        this.gateRepository = gateRepository;
        this.parkingFloorRepository = parkingFloorRepository;
        this.parkingLotRepository = parkingLotRepository;
        this.parkingSlotRepository = parkingSlotRepository;
    }

    @Override
    public void init() {
        ParkingLot parkingLot = new ParkingLot(1);
        parkingLot.setId(1);
        parkingLot.setName("Parking Lot 1");
        parkingLot.setAddress("Address A, City B, State C");
        parkingLot.setParkingLotStatus(ParkingLotStatus.OPEN);
        parkingLot.setSupportedVehicles(new ArrayList<>(Arrays.asList(VehicleType.BIKE,VehicleType.CAR)));
        parkingLot.setSlotAllocationStrategy(SlotAllocationStrategyFactory.slotAllocationStrategy());
        parkingLot.setBillCalculationStrategy(BillCalculationStrategyFactory.getBillCalculationStrategy(parkingSlotRepository));
        List<ParkingFloor> parkingFloors = new ArrayList<>();
        for(int i=0;i<10;i++){
            ParkingFloor parkingFloor = new ParkingFloor(i);
            parkingFloor.setFloorNumber(i);
            parkingFloor.setParkingFloorStatus(ParkingFloorStatus.OPEN);
            parkingFloor.setId(i);
            List<ParkingSlot> parkingSlots = new ArrayList<>();
            for(int j=1;j<=10;j++){
                ParkingSlot parkingSlot = new ParkingSlot(i*100+j);
                parkingSlot.setId(i*100+j);
                parkingSlot.setNumber(i*100+j);
                parkingSlot.setParkingSlotStatus(ParkingSlotStatus.AVAILABLE);
                parkingSlot.setSupportedVehicleType(j%2!=0?VehicleType.CAR:VehicleType.BIKE);
                parkingSlots.add(parkingSlot);
                parkingSlotRepository.put(parkingSlot);
            }
            parkingFloor.setParkingSlots(parkingSlots);

            Gate entryGate = new Gate(i*10+1,"A",i,i*10+1,1, GateType.ENTRY,GateStatus.OPEN);
            Gate exitGate = new Gate(i*10+1,"B",i,i*10+2,1, GateType.EXIT,GateStatus.OPEN);

            gateRepository.put(entryGate);
            gateRepository.put(exitGate);


            parkingFloor.setGates(new ArrayList<>(Arrays.asList(entryGate,exitGate)));

            parkingFloorRepository.put(parkingFloor);

            parkingFloors.add(parkingFloor);
        }
        parkingLot.setParkingFloors(parkingFloors);
        parkingLotRepository.put(parkingLot);
    }
}
