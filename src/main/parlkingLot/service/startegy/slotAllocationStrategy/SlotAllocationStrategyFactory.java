package main.parlkingLot.service.startegy.slotAllocationStrategy;

public class SlotAllocationStrategyFactory {
    public static SlotAllocationStrategy slotAllocationStrategy(){
        return new NearestSlotAllocationStrategy();
    }
}
