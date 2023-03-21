package Model;

import org.assertj.core.util.Lists;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BaseballNumbersTest {

    private BaseballNumbers cpuNumbers = new BaseballNumbers();
    private BaseballNumbers userNumbers = new BaseballNumbers();

    @BeforeEach
    private void init() throws Exception {
        cpuNumbers.addAllNumber(Arrays.asList(1,2,3));
    }

    @Test
    @DisplayName("점수 확인")
    void calculateScoreTest() throws Exception {
        Score score = new Score(3,0);
        userNumbers.addAllNumber(Arrays.asList(1,2,3));
        assertTrue(userNumbers.calculateScore(cpuNumbers.getNumbers()).equals(score));
    }
}