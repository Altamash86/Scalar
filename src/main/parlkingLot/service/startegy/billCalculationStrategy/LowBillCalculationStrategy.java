package main.parlkingLot.service.startegy.billCalculationStrategy;

import main.parlkingLot.models.Ticket;
import main.parlkingLot.models.constant.VehicleType;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class LowBillCalculationStrategy implements BillCalculationStrategy{

    private static final int PER_HOUR_CHARGE_2_WHEELER = 50;
    private static final int PER_HOUR_CHARGE_4_WHEELER = 100;
    private static final double INCREMENT_FACTOR = 0.1;

    @Override
    public double calculateBillAmount(Ticket ticket, LocalDateTime exitTime) {
        long totalHours = ChronoUnit.HOURS.between(ticket.getEntryTime(),exitTime);
        double vehicleCost = (ticket.getVehicle().getVehicleType().equals(VehicleType.BIKE))?
                PER_HOUR_CHARGE_2_WHEELER:
                PER_HOUR_CHARGE_4_WHEELER;
        double baseCost = vehicleCost * totalHours;
        return baseCost + (baseCost * (INCREMENT_FACTOR * (totalHours-1)));
    }
}
