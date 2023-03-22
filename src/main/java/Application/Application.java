package Application;

import Controller.GameController;

/*
* TODO 0 : GameService - Scanner BUGFIX
* TODO 1 : GameService 완성
* TODO 2 : GameController 완성
* TODO 3 : StringManager 완성
* TODO 4 : Input / Output View 완성
* TODO 5 : ScoreService 조정 ( 제거 또는 추가 기능 구현 )
* TODO 6 : StringManager 조정 ( 제거 또는 추가 기능 구현 )
* */

public class Application {
    public static void main(String[] args) throws Exception {
        GameController gameController = new GameController();
        gameController.startGame();
    }
}
