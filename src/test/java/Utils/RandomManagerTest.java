package Utils;

import Model.BaseballNumbers;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RandomManagerTest {

    @Test
    @DisplayName("랜덤 CPU 난수 생성")
    void generateCpuNumbers() throws Exception {
        BaseballNumbers baseballNumbers = new BaseballNumbers();
        baseballNumbers = RandomManager.generateCpuNumbers();
        System.out.println(baseballNumbers.getNumbers());
    }
}