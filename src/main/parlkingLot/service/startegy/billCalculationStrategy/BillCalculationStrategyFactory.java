package main.parlkingLot.service.startegy.billCalculationStrategy;

public class BillCalculationStrategyFactory {
    public static BillCalculationStrategy getBillCalculationStrategy(){
        return new LowBillCalculationStrategy();
    }
}
