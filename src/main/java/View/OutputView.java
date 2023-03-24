package View;

import Model.BaseballMessages;
import Model.Score;

public class OutputView {

    public static void printRetryMessage() {
        System.out.println(BaseballMessages.endMessage);
    }

    public static void printEnterNewNumbersMessage(){
        System.out.println(BaseballMessages.enterNumberMessage);
    }

    public static void printStrikeCountMessage(Score score){
        System.out.print(score.getStrike() + BaseballMessages.STRIKE);
    }

    public static void printBallCountMessage(Score score){
        System.out.print(score.getBall() + BaseballMessages.BALL);
    }

    public static void printNothingMessage(){
        System.out.print(BaseballMessages.NOTHING);
    }

    public static void println(){
        System.out.print("\n");
    }
}
