package main.parlkingLot;

import main.parlkingLot.controller.BillController;
import main.parlkingLot.controller.TicketController;
import main.parlkingLot.dto.TicketRequestDTO;
import main.parlkingLot.dto.TicketResponseDTO;
import main.parlkingLot.models.Gate;
import main.parlkingLot.models.Vehicle;
import main.parlkingLot.models.constant.VehicleType;
import main.parlkingLot.repository.*;
import main.parlkingLot.service.InitService;
import main.parlkingLot.service.InitServiceImpl;

public class ParkingLotMain {
    public static void main(String[] args) {
        ParkingLotRepository parkingLotRepository = new ParkingLotRepository();
        ParkingFloorRepository parkingFloorRepository = new ParkingFloorRepository();
        ParkingSlotRepository parkingSlotRepository = new ParkingSlotRepository();
        GateRepository gateRepository = new GateRepository();
        TicketRepository ticketRepository = new TicketRepository();
        InitService initService = new InitServiceImpl(gateRepository,parkingFloorRepository,parkingLotRepository,parkingSlotRepository);
        initService.init();

        TicketController ticketController = new TicketController(parkingLotRepository,ticketRepository,gateRepository);

        TicketRequestDTO requestDTO = new TicketRequestDTO(31, new Vehicle(1,"MH18AG7086","Mercedez", VehicleType.CAR));

        TicketResponseDTO responseDTO = ticketController.getTicket(requestDTO);
        System.out.println(responseDTO);

        BillController billController = new BillController(ticketRepository,parkingSlotRepository);
        System.out.println(billController.getBillAmount(responseDTO.ticketId()));
    }
}
