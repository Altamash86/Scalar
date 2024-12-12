package main.parlkingLot.service.startegy.billCalculationStrategy;

import main.parlkingLot.models.ParkingSlot;
import main.parlkingLot.models.Ticket;
import main.parlkingLot.models.constant.ParkingSlotStatus;
import main.parlkingLot.models.constant.TicketStatus;
import main.parlkingLot.models.constant.VehicleType;
import main.parlkingLot.repository.ParkingSlotRepository;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.List;

public class LowBillCalculationStrategy implements BillCalculationStrategy{

    private static final int PER_HOUR_CHARGE_2_WHEELER = 50;
    private static final int PER_HOUR_CHARGE_4_WHEELER = 100;
    private static final double INCREMENT_FACTOR = 0.1;

    private ParkingSlotRepository parkingSlotRepository;

    public LowBillCalculationStrategy(ParkingSlotRepository parkingSlotRepository) {
        this.parkingSlotRepository = parkingSlotRepository;
    }

    @Override
    public double calculateBillAmount(Ticket ticket, LocalDateTime exitTime) {
        long totalHours = ChronoUnit.HOURS.between(ticket.getEntryTime(),exitTime);
        double vehicleCost = (ticket.getVehicle().getVehicleType().equals(VehicleType.BIKE))?
                PER_HOUR_CHARGE_2_WHEELER:
                PER_HOUR_CHARGE_4_WHEELER;
        ticket.setTicketStatus(TicketStatus.EXPIRED);
        ParkingSlot parkingSlot = ticket.getParkingSlot();
        parkingSlotRepository.get(parkingSlot.getId()).setParkingSlotStatus(ParkingSlotStatus.AVAILABLE);
        parkingSlotRepository.get(parkingSlot.getId()).setVehicle(null);
        double baseCost = vehicleCost * totalHours;
        return baseCost + (baseCost * (INCREMENT_FACTOR * (totalHours-1)));
    }
}
