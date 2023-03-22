package Application;

import java.util.Scanner;

//리팩토링 이전 코드들
//한 메서드씩 리팩토링 후 제거하는 중
public class NumberBaseballNEEDREFACTOR {
    int inputBigNum;
    public int inputNumbers[], computerNumbers[];
    int strike, ball;

    public void initGame(){
        this.strike = 0;
        this.ball = 0;
        this.inputNumbers = new int[3];
        this.computerNumbers = new int[3];
        //generateComputerNumbers();
    }

    public void initRound(){
        this.strike = 0;
        this.ball = 0;
    }

    public int input(){
        System.out.print("숫자를 입력해 주세요 : ");
        Scanner scanner = new Scanner(System.in);
        this.inputBigNum = scanner.nextInt();
        return this.inputBigNum;
    }

    public int[] divideNumbers(int originalNumber){
        this.inputNumbers[0] = originalNumber / 100 % 10;
        this.inputNumbers[1] = originalNumber / 10  % 10;
        this.inputNumbers[2] = originalNumber / 1   % 10;

        return this.inputNumbers;
    }

    public String getResult(){
        String result = new String();

        if(this.ball > 0)
            result = this.ball + "볼 ";
        if(this.strike > 0)
            result += this.strike + "스트라이크";
        if(result.equals(""))
            result = "낫싱";

        return result;
    }
}