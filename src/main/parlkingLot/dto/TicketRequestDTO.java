package main.parlkingLot.dto;

import main.parlkingLot.models.Vehicle;

public record TicketRequestDTO(int gateId, Vehicle vehicle) {
}
