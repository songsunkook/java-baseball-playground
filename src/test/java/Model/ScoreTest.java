package Model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class ScoreTest {
    private Score score;

    @BeforeEach
    public void init() {
        score = new Score(1, 1);
    }

    @ParameterizedTest
    @DisplayName("Score Add and Equals")
    @MethodSource("addScoreArguments")
    public void addScoreTest(Score score1, Score score2, Score resultScore) {
        score1.addScore(score2);
        assertTrue(score1.equals(resultScore));
    }

    private static Stream<Arguments> addScoreArguments(){
        return Stream.of(
                Arguments.of(new Score(0,0), new Score(1,2), new Score(1,2)),
                Arguments.of(new Score(1,1), new Score(1,0), new Score(2,1)),
                Arguments.of(new Score(2,0), new Score(1,2), new Score(3,2))
        );
    }
}