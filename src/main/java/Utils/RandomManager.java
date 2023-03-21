package Utils;

import Model.BaseballNumbers;

import java.util.Random;

public class RandomManager {
    public static BaseballNumbers generateCpuNumbers() throws Exception {
        int randomNumber = rand();
        BaseballNumbers cpuNumbers = new BaseballNumbers();

        while (cpuNumbers.size() < cpuNumbers.getMaxLength()) {
            while (cpuNumbers.isContain(cpuNumbers.getNumbers(), randomNumber)){
                randomNumber = rand();
            }
            cpuNumbers.addNumber(randomNumber);
        }

        return cpuNumbers;
    }

    private static int rand() {
        Random random = new Random();
        random.setSeed(System.currentTimeMillis());

        return random.nextInt(9) + 1;
    }
}