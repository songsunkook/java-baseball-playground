package Service;

import java.util.Scanner;

public class GameService {

    public void initGame(){

    }

    public void initRound(){

    }
}

/*
public class NumberBaseballNEEDREFACTOR {
    int inputBigNum;
    public int inputNumbers[], computerNumbers[];
    int strike, ball;

    public NumberBaseballNEEDREFACTOR(){
        initGame();
    }

    public void initGame(){
        this.strike = 0;
        this.ball = 0;
        this.inputNumbers = new int[3];
        this.computerNumbers = new int[3];
        generateComputerNumbers();
    }

    public void initRound(){
        this.strike = 0;
        this.ball = 0;
    }

    public void generateComputerNumbers(){
        int numbers[] = new int[3];
        for(int i=0; i<3; i++){
            generateRandom(numbers, i);
        }
        this.computerNumbers = numbers.clone();
    }

    void generateRandom(int numbers[], int idxNow){
        numbers[idxNow] = rand();
        checkOverlap(numbers, idxNow);
    }

    void checkOverlap(int numbers[], int idxNow){
        boolean overlap = false;
        for(int i=idxNow; i>0; i--){
            overlap = checkBeforeNumbers(numbers,idxNow-i,idxNow);
        }
        if(overlap)
            checkOverlap(numbers, idxNow);
    }

    boolean checkBeforeNumbers(int numbers[], int idx, int idxNow){
        if(numbers[idx] == numbers[idxNow]) {
            generateRandom(numbers, idxNow);
            return true;
        }
        return false;
    }

    int rand(){
        return (int)(Math.random() * 8 + 1);
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

    public void checkScore(){
        for(int i=0; i<3; i++){
            repeatThree(i);
        }
    }

    void repeatThree(int idxCom){
        for(int i=0; i<3; i++){
            checkEquals(idxCom,i);
        }
    }

    void checkEquals(int idxCom, int idxUser){
        if(this.computerNumbers[idxCom] == this.inputNumbers[idxUser]){
            judgeStrikeOrBall(idxCom, idxUser);
        }
    }

    void judgeStrikeOrBall(int idxCom, int idxUser){
        if(idxCom == idxUser)
            this.strike++;
        if(idxCom != idxUser)
            this.ball++;
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
}*/
