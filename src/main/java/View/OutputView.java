package View;

import Model.BaseballMessages;

public class OutputView {

    public static void printRetryMessage() {
        System.out.println(BaseballMessages.endMessage);
    }

    public static void printEnterNewNumbersMessage(){
        System.out.println(BaseballMessages.enterNumberMessage);
    }
}
