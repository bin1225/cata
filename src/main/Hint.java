package main;

public class Hint {
    private int strike;
    private int ball;

    public Hint(int strike, int ball){
        this.strike = strike;
        this.ball = ball;
    }

    public int getStrike() {
        return strike;
    }

    @Override
    public String toString() {
        if (strike == 0 && ball == 0) {
            return "낫싱";
        } else if (strike == 0) {
            return ball + "볼";
        } else if (ball == 0) {
            return strike + " 스트라이크";
        } else {
            return strike + " 스트라이크 " + ball + "볼";
        }
    }
}
