package main.tictactoe.models;

import main.tictactoe.service.botplayingstrategy.BotPlayingStrategy;
import main.tictactoe.service.botplayingstrategy.BotPlayingStrategyFactory;

public class Bot extends Player{
    private BotDifficultyLevel botDifficultyLevel;

    public Bot(int id, String name, char symbol, PlayerType playerType, BotDifficultyLevel botDifficultyLevel) {
        super(id, name, symbol, playerType);
        this.botDifficultyLevel = botDifficultyLevel;
    }

    @Override
    public Move makeMove(Board currentBoard) {
        BotPlayingStrategy strategy = BotPlayingStrategyFactory.getBotPlayingStrategy();
        return strategy.makeMove(currentBoard,this);
    }
}
