package Controller;

public class GameController {
    public void startGame() {

    }
}

/*
                public static void main(String[] args){
                    GameController.startGame();

                    boolean failed = true;
                    String result = new String();
                    NumberBaseballNEEDREFACTOR numberBaseballNEEDREFACTOR = new NumberBaseballNEEDREFACTOR();

        while(failed){
            numberBaseballNEEDREFACTOR.initRound();
            numberBaseballNEEDREFACTOR.divideNumbers(numberBaseballNEEDREFACTOR.input());
            numberBaseballNEEDREFACTOR.checkScore();
            result = numberBaseballNEEDREFACTOR.getResult();
            System.out.println(result);
            failed = checkResult(result); // 3스트라이크 시 True가 반환되도록 변경됨.
            failed = getRestartAnswer(failed, numberBaseballNEEDREFACTOR);
        }
    }


    static boolean checkResult(String result){
        if(result.equals("3스트라이크"))
            return false;
        return true;
    }


    static boolean getRestartAnswer(boolean failed, NumberBaseballNEEDREFACTOR numberBaseballNEEDREFACTOR){
        if(failed)
            return true;

        OutputView.printRetryMessage();

        int answer = InputView.getInt();
        if(answer == 1) {
            //numberBaseballNEEDREFACTOR.initGame();
            //게임 재시작 시 True 반환
            return true;
        }
        if(answer == 2)
            //게임 종료 시 False 반환
            return false;
        return false;
    }

*/