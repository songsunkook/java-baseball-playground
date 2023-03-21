package Model;

public class Score {
    private int strike;
    private int ball;

    public Score(){
        this.strike = 0;
        this.ball = 0;
    }
    public Score(int strike, int ball){
        this.strike = strike;
        this.ball = ball;
    }

    public void addScore(Score score){
        this.strike += score.strike;
        this.ball += score.ball;
    }

    public boolean equals(Object obj){
        Score score = (Score) obj;
        if(this.strike == score.strike && this.ball == score.ball)
            return true;
        return false;
    }

    public int getStrike() {
        return this.strike;
    }

    public int getBall() {
        return this.ball;
    }

    public void addStrike(){
        this.strike++;
    }

    public void addBall(){
        this.ball++;
    }
}
