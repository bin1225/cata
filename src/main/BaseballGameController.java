package main;

import java.util.List;

public class BaseballGameController {

    private static Computer computer = new Computer();
    public static void startGame(){
        Output.printGameStartMessage();
        List<Integer> expectNumbers = computer.createRandomNumbers();

        Output.printInputGuideMessage();
        List<Integer> inputNumbers = Input.getThreeNumber();

        while(true){
            Hint hint = computer.compareNumbers(expectNumbers, inputNumbers);
            if(hint.getStrike() == GameConfiguration.BALL_SIZE) break;
            Output.printHint(hint);
            inputNumbers = Input.getThreeNumber();
        }
        Output.printGameEndMessage();
    }
}
