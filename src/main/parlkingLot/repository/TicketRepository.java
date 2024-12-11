package main.parlkingLot.repository;

import main.parlkingLot.exceptions.TicketNotFoundException;
import main.parlkingLot.models.Ticket;

import java.util.HashMap;

public class TicketRepository {
    private HashMap<Integer, Ticket> ticketMap;

    public TicketRepository() {
        this.ticketMap = new HashMap<>();
    }

    public Ticket get(int TicketId){
        if(ticketMap.get(TicketId)==null){
            throw new TicketNotFoundException("Ticket Not found for ParkingLotId: "+TicketId);
        }
        return ticketMap.get(TicketId);
    }

    public Ticket put(Ticket ticket){
        ticketMap.put(ticket.getId(),ticket);
        return ticket;
    }
}
