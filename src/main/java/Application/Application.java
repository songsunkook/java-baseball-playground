package Application;

import Controller.GameController;

public class Application {
    public static void main(String[] args) throws Exception {
        GameController gameController = new GameController();
        gameController.startGame();
    }
}
