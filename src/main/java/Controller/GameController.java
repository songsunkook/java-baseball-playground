package Controller;

import Service.GameService;

public class GameController {
    GameService gameService = new GameService();
    public void startGame() throws Exception {
        gameService.initGame();
    }
}