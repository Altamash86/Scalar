package main.parlkingLot.models;

import main.parlkingLot.models.constant.ParkingLotStatus;
import main.parlkingLot.models.constant.VehicleType;
import main.parlkingLot.service.startegy.billCalculationStrategy.BillCalculationStrategy;
import main.parlkingLot.service.startegy.slotAllocationStrategy.SlotAllocationStrategy;

import java.util.List;

public class ParkingLot extends BaseModels{
    private String name;
    private String address;
    private ParkingLotStatus parkingLotStatus;
    List<VehicleType> supportedVehicles;
    private List<ParkingFloor> parkingFloors;
    private SlotAllocationStrategy slotAllocationStrategy;
    private BillCalculationStrategy billCalculationStrategy;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public ParkingLotStatus getParkingLotStatus() {
        return parkingLotStatus;
    }

    public void setParkingLotStatus(ParkingLotStatus parkingLotStatus) {
        this.parkingLotStatus = parkingLotStatus;
    }

    public List<VehicleType> getSupportedVehicles() {
        return supportedVehicles;
    }

    public void setSupportedVehicles(List<VehicleType> supportedVehicles) {
        this.supportedVehicles = supportedVehicles;
    }

    public List<ParkingFloor> getParkingFloors() {
        return parkingFloors;
    }

    public void setParkingFloors(List<ParkingFloor> parkingFloors) {
        this.parkingFloors = parkingFloors;
    }

    public SlotAllocationStrategy getSlotAllocationStrategy() {
        return slotAllocationStrategy;
    }

    public void setSlotAllocationStrategy(SlotAllocationStrategy slotAllocationStrategy) {
        this.slotAllocationStrategy = slotAllocationStrategy;
    }

    public BillCalculationStrategy getBillCalculationStrategy() {
        return billCalculationStrategy;
    }

    public void setBillCalculationStrategy(BillCalculationStrategy billCalculationStrategy) {
        this.billCalculationStrategy = billCalculationStrategy;
    }
}
