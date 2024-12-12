package main.parlkingLot.models;

import main.parlkingLot.models.constant.VehicleType;

public class Vehicle extends BaseModels{
    private String vehicleNumber;
    private String name;
    private VehicleType vehicleType;

    public Vehicle(int id, String vehicleNumber, String name, VehicleType vehicleType) {
        super(id);
        this.vehicleNumber = vehicleNumber;
        this.name = name;
        this.vehicleType = vehicleType;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }
}
