package main.parlkingLot.service;

import main.parlkingLot.dto.TicketRequestDTO;
import main.parlkingLot.models.Gate;
import main.parlkingLot.models.ParkingLot;
import main.parlkingLot.models.ParkingSlot;
import main.parlkingLot.models.Ticket;
import main.parlkingLot.models.constant.TicketStatus;
import main.parlkingLot.repository.GateRepository;
import main.parlkingLot.repository.ParkingLotRepository;
import main.parlkingLot.repository.TicketRepository;
import main.parlkingLot.service.startegy.slotAllocationStrategy.SlotAllocationStrategyFactory;

import java.time.LocalDateTime;

public class TicketServiceImpl implements TicketService{

    private ParkingLotRepository parkingLotRepository;
    private TicketRepository ticketRepository;
    private GateRepository gateRepository;

    public TicketServiceImpl(ParkingLotRepository parkingLotRepository, TicketRepository ticketRepository, GateRepository gateRepository) {
        this.parkingLotRepository = parkingLotRepository;
        this.ticketRepository = ticketRepository;
        this.gateRepository = gateRepository;
    }

    @Override
    public Ticket getTicket(TicketRequestDTO request,  int parLotId) {
        String vehicleNumber = request.vehicle().getVehicleNumber();
        LocalDateTime entryTime = LocalDateTime.now();
        ParkingLot parkingLot = parkingLotRepository.get(parLotId);
        Gate gate = gateRepository.get(request.gateId());
        ParkingSlot slot = SlotAllocationStrategyFactory.slotAllocationStrategy().getParkingSlot(request.vehicle(), parkingLot, gate);
        Ticket ticket = new Ticket(entryTime, gate, request.vehicle(),slot, TicketStatus.ACTIVE);
        return ticketRepository.put(ticket);
    }
}
