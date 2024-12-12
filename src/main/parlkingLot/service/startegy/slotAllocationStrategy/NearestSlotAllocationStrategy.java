package main.parlkingLot.service.startegy.slotAllocationStrategy;

import main.parlkingLot.exceptions.NoEmptySlotException;
import main.parlkingLot.models.Gate;
import main.parlkingLot.models.ParkingLot;
import main.parlkingLot.models.ParkingSlot;
import main.parlkingLot.models.Vehicle;
import main.parlkingLot.models.constant.ParkingSlotStatus;

import java.util.List;

public class NearestSlotAllocationStrategy implements SlotAllocationStrategy{

    @Override
    public ParkingSlot getParkingSlot(Vehicle vehicle, ParkingLot parkingLot, Gate entryGate) {
        int floor = entryGate.getFloorNumber();
        List<ParkingSlot> list = parkingLot.getParkingFloors().get(floor).getParkingSlots();

        for(ParkingSlot parkingSlot : list){
            if(parkingSlot.getParkingSlotStatus().equals(ParkingSlotStatus.AVAILABLE)
                && parkingSlot.getSupportedVehicleType().equals(vehicle.getVehicleType())){
                parkingSlot.setParkingSlotStatus(ParkingSlotStatus.NOT_AVAILABLE);
                parkingSlot.setVehicle(vehicle);
                return parkingSlot;
            }
        }

        int i = floor - 1;
        int j = floor + 1;

        while(i>=0 || j<parkingLot.getParkingFloors().size()){
            if(i>=0) {
                list = parkingLot.getParkingFloors().get(i).getParkingSlots();
                for (ParkingSlot parkingSlot : list) {
                    if (parkingSlot.getParkingSlotStatus().equals(ParkingSlotStatus.AVAILABLE)
                            && parkingSlot.getSupportedVehicleType().equals(vehicle.getVehicleType())) {
                        parkingSlot.setParkingSlotStatus(ParkingSlotStatus.NOT_AVAILABLE);
                        parkingSlot.setVehicle(vehicle);
                        return parkingSlot;
                    }
                }
            }
            else if(j<parkingLot.getParkingFloors().size()){
                list = parkingLot.getParkingFloors().get(j).getParkingSlots();
                for (ParkingSlot parkingSlot : list) {
                    if (parkingSlot.getParkingSlotStatus().equals(ParkingSlotStatus.AVAILABLE)
                            && parkingSlot.getSupportedVehicleType().equals(vehicle.getVehicleType())) {
                        parkingSlot.setParkingSlotStatus(ParkingSlotStatus.NOT_AVAILABLE);
                        parkingSlot.setVehicle(vehicle);
                        return parkingSlot;
                    }
                }
            }
            i--;
            j++;
        }

        throw new NoEmptySlotException("No Slot Available for Parking, Kindly visit later!!");
    }
}
