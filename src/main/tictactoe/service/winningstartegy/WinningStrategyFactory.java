package main.tictactoe.service.winningstartegy;

public class WinningStrategyFactory {
    public static WinningStrategy getWinningStrategy(WinningStrategies winningStrategies, int dimension){
        return new OrderOneWinningStartegy(dimension);
    }
}
