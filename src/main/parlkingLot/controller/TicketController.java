package main.parlkingLot.controller;

import main.parlkingLot.dto.TicketRequestDTO;
import main.parlkingLot.dto.TicketResponseDTO;
import main.parlkingLot.models.Ticket;
import main.parlkingLot.repository.GateRepository;
import main.parlkingLot.repository.ParkingLotRepository;
import main.parlkingLot.repository.TicketRepository;
import main.parlkingLot.service.TicketService;
import main.parlkingLot.service.TicketServiceImpl;

public class TicketController {

    private TicketService ticketService;

    public TicketController(ParkingLotRepository parkingLotRepository, TicketRepository ticketRepository, GateRepository gateRepository) {
        this.ticketService = new TicketServiceImpl(parkingLotRepository,ticketRepository,gateRepository);
    }

    public TicketResponseDTO getTicket(TicketRequestDTO request){
        Ticket ticket = ticketService.getTicket(request,1);
        return new TicketResponseDTO(ticket.getId(), ticket.getVehicle().getVehicleNumber(),ticket.getEntryTime(),ticket.getParkingSlot().getNumber());
    }
}
