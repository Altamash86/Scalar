package main.parlkingLot.service;

import main.parlkingLot.dto.TicketRequestDTO;
import main.parlkingLot.dto.TicketResponseDTO;
import main.parlkingLot.models.Ticket;

public interface TicketService {
    Ticket getTicket(TicketRequestDTO request, int parLotId);
}
