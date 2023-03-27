package Controller;

import Service.GameService;
import View.OutputView;

public class GameController {
    private GameService gameService = new GameService();

    public void startGame() throws Exception {
        gameService.initGame();
    }

    public static void printEnterNewNumbersMessage(){
        OutputView.printEnterNewNumbersMessage();
    }
}
