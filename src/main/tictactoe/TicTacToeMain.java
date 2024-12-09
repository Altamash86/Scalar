package main.tictactoe;

import com.sun.source.tree.WhileLoopTree;
import main.tictactoe.controller.GameController;
import main.tictactoe.models.*;
import main.tictactoe.service.winningstartegy.WinningStrategies;

import java.util.*;

public class TicTacToeMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GameController gameController = new GameController();

        System.out.println("Enter dimension: ");
        int dimension = sc.nextInt();

        System.out.println("Will there be BOT? Y/N");
        String isBOTPresent = sc.next();

        int iteratorNumber = dimension - 1;

        if(isBOTPresent.equalsIgnoreCase("Y")){
            iteratorNumber--;
        }

        List<Player> players = new ArrayList<>();

        for(int i=1;i<=iteratorNumber;i++){
            System.out.println("Enter Name of Player: "+i);
            String name = sc.next();
            System.out.println("Enter Symbol of "+name+":");
            String symbol = sc.next();
            players.add(new Player(i,name,symbol.charAt(0), PlayerType.HUMAN));
        }

        if(isBOTPresent.equalsIgnoreCase("Y")){
            System.out.println("Enter Symbol of BOT: ");
            String symbol = sc.next();
            BotDifficultyLevel botDifficultyLevel = BotDifficultyLevel.EASY;
            Bot bot = new Bot(
                    dimension,
                    "BOT",
                    symbol.charAt(0),
                    PlayerType.BOT,
                    botDifficultyLevel
            );
            players.add(bot);
        }

        Collections.shuffle(players);

        Game game = gameController.creatGame(dimension,players, WinningStrategies.ORDERONE_WINNINGSTRATEGY);

        int playerIndex = -1;

        while(game.getGameStatus().equals(GameStatus.IN_PROGRESS)){
            System.out.println("Current Board");
            gameController.displayBoard(game);
            playerIndex++;
            playerIndex = playerIndex % players.size();
            System.out.println(players.get(playerIndex).getName()+" turn");
            Move move = gameController.executeMove(game,players.get(playerIndex));
            Player p = gameController.checkWinner(game,move);
            if(p!=null){
                game.setWinner(p);
                game.setGameStatus(GameStatus.COMPLETED);
                System.out.println("Winner: "+p.getName());
                break;
            }
        }
        System.out.println("Final board status");
        gameController.displayBoard(game);
        System.out.println("Do you want a see replay? Y/N");
        String replay = sc.next();
        if(replay.equalsIgnoreCase("Y")){
            gameController.gameReplay(game);
        }

    }
}
