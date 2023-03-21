package Service;

import Model.BaseballMessages;
import Utils.StringManager;

public class ScoreService {
    private static final int GoalStrikeCount = 3;

    public static boolean checkResult(String result) {
        //3스트라이크 시 True 반환
        return result.equals(StringManager.integerToString(GoalStrikeCount) + BaseballMessages.STRIKE);
    }
}
