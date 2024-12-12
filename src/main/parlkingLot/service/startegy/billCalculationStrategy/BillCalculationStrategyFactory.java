package main.parlkingLot.service.startegy.billCalculationStrategy;

import main.parlkingLot.repository.ParkingSlotRepository;

public class BillCalculationStrategyFactory {
    public static BillCalculationStrategy getBillCalculationStrategy(ParkingSlotRepository parkingSlotRepository){
        return new LowBillCalculationStrategy(parkingSlotRepository);
    }
}
