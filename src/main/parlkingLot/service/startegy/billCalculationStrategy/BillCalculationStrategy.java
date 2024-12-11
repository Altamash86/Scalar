package main.parlkingLot.service.startegy.billCalculationStrategy;

import main.parlkingLot.models.Ticket;

import java.time.LocalDateTime;

public interface BillCalculationStrategy {
    double calculateBillAmount(Ticket ticket, LocalDateTime exitTime);
}
