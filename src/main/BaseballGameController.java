package main;

public class BaseballGameController {

    private static Ball ball = new Ball();
    public static void startGame(){
        Output.printGameStartMessage();
        ball.createBall();

    }
}
