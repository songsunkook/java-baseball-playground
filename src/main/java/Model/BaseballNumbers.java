package Model;

import java.util.ArrayList;
import java.util.List;

public class BaseballNumbers {
    private static final String overMaxLengthMessage = "숫자 개수 한계치 초과";
    private static final int maxLength = 3;

    private List<Integer> numbers = new ArrayList<>();

    public void addNumber(int num) throws Exception {
        if (this.numbers.size() == maxLength) {
            throw new Exception(overMaxLengthMessage);
        }
        this.numbers.add(num);
    }

    public void addAllNumber(List<Integer> numbers) {
        if (this.numbers.size() > 0) {
            this.numbers = new ArrayList<>();
        }
        this.numbers.addAll(numbers);
    }

    public Score calculateScore(List<Integer> numbers) {
        Score score = new Score();

        for (int i = 0; i < maxLength; i++) {
            score.addScore(containNumber(numbers, i));
        }

        return score;
    }

    private Score containNumber(List<Integer> numbers, int idx) {
        Score score = new Score();

        if (this.numbers.contains(numbers.get(idx))) {
            if (this.numbers.get(idx) == numbers.get(idx)) {
                score.addStrike();
            }
            if (this.numbers.get(idx) != numbers.get(idx)) {
                score.addBall();
            }
        }

        return score;
    }

    public boolean isContain(List<Integer> numbers, int number) {
        return numbers.contains(number);
    }

    public List<Integer> getNumbers() {
        return numbers;
    }

    public int size() {
        return numbers.size();
    }

    public int getMaxLength() {
        return maxLength;
    }
}
