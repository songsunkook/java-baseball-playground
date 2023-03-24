package Service;

import Model.BaseballNumbers;
import Model.Score;
import Utils.RandomManager;
import View.InputView;
import View.OutputView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GameService {
    private Score score;
    private BaseballNumbers cpuNumbers = new BaseballNumbers();
    private BaseballNumbers userNumbers = new BaseballNumbers();

    public void initGame() throws Exception {
        cpuNumbers = RandomManager.generateCpuNumbers();
        score = new Score();
        initRound();
    }

    private void initRound() throws Exception {
        OutputView.printEnterNewNumbersMessage();
        userNumbers.addAllNumber(enterUserNumbers());

        playGame();
    }

    private void playGame() throws Exception {
        if(!checkThreeStrike())
            initRound();

        else if(retryGame())
            initGame();
    }

    private boolean checkThreeStrike(){
        score = calculateScore();

        if(score.getStrike() == 3)
            return true;
        printRoundResult();
        return false;
    }

    private Score calculateScore(){
        return this.userNumbers.calculateScore(cpuNumbers.getNumbers());
    }

    private void printRoundResult(){
        if(score.getStrike() > 0)
            OutputView.printStrikeCountMessage(score);
        if(score.getBall() > 0)
            OutputView.printBallCountMessage(score);
        if(score.getStrike() == 0 && score.getBall() == 0)
            OutputView.printNothingMessage();
        OutputView.println();
    }
    private boolean retryGame(){
        int input;
        OutputView.printRetryMessage();
        input = InputView.getInt();
        if(input == 1)
            return true;
        return false;
    }

    private List<Integer> enterUserNumbers(){
        int bigNumber = InputView.getInt();
        List<Integer> numbers = new ArrayList<>();

        while(bigNumber > 0){
            numbers.add(bigNumber % 10);
            bigNumber /= 10;
        }
        Collections.reverse(numbers);

        return numbers;
    }
}