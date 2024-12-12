package main.parlkingLot.controller;

import main.parlkingLot.models.Ticket;
import main.parlkingLot.repository.ParkingSlotRepository;
import main.parlkingLot.repository.TicketRepository;
import main.parlkingLot.service.startegy.billCalculationStrategy.BillCalculationStrategyFactory;

import java.time.LocalDateTime;

public class BillController {

    private TicketRepository ticketRepository;
    private ParkingSlotRepository parkingSlotRepository;

    public BillController(TicketRepository ticketRepository, ParkingSlotRepository parkingSlotRepository) {
        this.ticketRepository = ticketRepository;
        this.parkingSlotRepository = parkingSlotRepository;
    }

    public double getBillAmount(int ticketNumber){
        Ticket ticket = ticketRepository.get(ticketNumber);
        LocalDateTime exitTime = ticket.getEntryTime().plusHours(3);
        return BillCalculationStrategyFactory.getBillCalculationStrategy(parkingSlotRepository).calculateBillAmount(ticket,exitTime);
    }
}
