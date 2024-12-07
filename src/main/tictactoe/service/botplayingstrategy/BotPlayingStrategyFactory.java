package main.tictactoe.service.botplayingstrategy;

public class BotPlayingStrategyFactory {
    public static BotPlayingStrategy getBotPlayingStrategy(){
        return new RandomBotPlayingStrategy();
    }
}
