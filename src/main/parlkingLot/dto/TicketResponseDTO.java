package main.parlkingLot.dto;

import java.time.LocalDateTime;

public record TicketResponseDTO(int ticketId, String vehicleNumber, LocalDateTime entryTime, int slotNumber) {
}
