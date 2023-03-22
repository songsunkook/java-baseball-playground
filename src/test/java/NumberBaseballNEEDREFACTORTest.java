/*
import Application.NumberBaseballNEEDREFACTOR;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberBaseballNEEDREFACTORTest {
    NumberBaseballNEEDREFACTOR numberBaseballNEEDREFACTOR;

    @BeforeEach
    void init(){
        this.numberBaseballNEEDREFACTOR = new NumberBaseballNEEDREFACTOR();
    }

    @ParameterizedTest
    @DisplayName("Divide Numbers")
    @CsvSource(value = {"123:1 2 3", "456:4 5 6"}, delimiter = ':')
    void testDivideNumbers(String originalNumber, String resultNumber){
        int correntNums[] = splitNumbers(resultNumber);

        int result[] = this.numberBaseballNEEDREFACTOR.divideNumbers(stringToInt(originalNumber));

        assertArrayEquals(result, correntNums);
    }

    @ParameterizedTest
    @DisplayName("Result")
    @CsvSource(value = {"1 2 3:1 2 3:3스트라이크", "4 5 6:4 5 3:2스트라이크", "1 2 3:3 2 1:2볼 1스트라이크"}, delimiter = ':')
    void testResult(String originalNumber, String computerNumber, String result){
        this.numberBaseballNEEDREFACTOR.inputNumbers = splitNumbers(originalNumber).clone();
        this.numberBaseballNEEDREFACTOR.computerNumbers = splitNumbers(computerNumber).clone();
        this.numberBaseballNEEDREFACTOR.checkScore();

        assertEquals(this.numberBaseballNEEDREFACTOR.getResult(), result);
    }

    @Test
    @DisplayName("randomTest")
    void testGenerateComputerNumbers(){
        this.numberBaseballNEEDREFACTOR.generateComputerNumbers();
        System.out.print(this.numberBaseballNEEDREFACTOR.computerNumbers[0]);
        System.out.print(this.numberBaseballNEEDREFACTOR.computerNumbers[1]);
        System.out.println(this.numberBaseballNEEDREFACTOR.computerNumbers[2]);
    }

    @Test
    @DisplayName("input")
    void testInput(){
        this.numberBaseballNEEDREFACTOR.input();
    }

    int[] splitNumbers(String resultNumber){
        int correntNums[] = new int[3];
        correntNums[0] = Integer.parseInt(resultNumber.split(" ")[0]);
        correntNums[1] = Integer.parseInt(resultNumber.split(" ")[1]);
        correntNums[2] = Integer.parseInt(resultNumber.split(" ")[2]);
        return correntNums;
    }

    int stringToInt(String string){
        return Integer.parseInt(string);
    }
}
*/
