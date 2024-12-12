package main.parlkingLot.models;

import main.parlkingLot.models.constant.TicketStatus;

import java.time.LocalDateTime;

public class Ticket extends BaseModels{
    private LocalDateTime entryTime;
    private int number;
    private Gate gate;
    private Vehicle vehicle;
    private ParkingSlot parkingSlot;
    private TicketStatus ticketStatus;
    private static int ticketNumber = 1;

    public Ticket() {
        super(ticketNumber++);
    }

    public Ticket(LocalDateTime entryTime, Gate gate, Vehicle vehicle, ParkingSlot parkingSlot, TicketStatus ticketStatus) {
        super(ticketNumber++);
        this.entryTime = entryTime;
        this.gate = gate;
        this.vehicle = vehicle;
        this.parkingSlot = parkingSlot;
        this.ticketStatus = ticketStatus;
    }

    public Ticket(int id) {
        super(id);
    }

    public LocalDateTime getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(LocalDateTime entryTime) {
        this.entryTime = entryTime;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Gate getGate() {
        return gate;
    }

    public void setGate(Gate gate) {
        this.gate = gate;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public ParkingSlot getParkingSlot() {
        return parkingSlot;
    }

    public void setParkingSlot(ParkingSlot parkingSlot) {
        this.parkingSlot = parkingSlot;
    }

    public TicketStatus getTicketStatus() {
        return ticketStatus;
    }

    public void setTicketStatus(TicketStatus ticketStatus) {
        this.ticketStatus = ticketStatus;
    }
}
