package Model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class BaseballNumbersTest {

    private BaseballNumbers cpuNumbers = new BaseballNumbers();
    private BaseballNumbers userNumbers = new BaseballNumbers();

    @BeforeEach
    public void init() throws Exception {
        cpuNumbers.addAllNumber(Arrays.asList(1,2,3));
    }

    @Test
    @DisplayName("점수 확인")
    public void calculateScoreTest() throws Exception {
        Score score = new Score(3,0);
        userNumbers.addAllNumber(Arrays.asList(1,2,3));
        assertTrue(userNumbers.calculateScore(cpuNumbers.getNumbers()).equals(score));
    }
}