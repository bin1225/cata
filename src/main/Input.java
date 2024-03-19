package main;


import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;


public class Input {

    private static Scanner scanner = new Scanner(System.in);
    public static List<Integer> getThreeNumber(){
        List<Integer> numbers = new ArrayList<>();
        while(true){
            numbers.clear();
            try{
                for(int i=0; i<GameConfiguration.BALL_SIZE; i++){
                    numbers.add(getNextValidInt());
                }
                if(InputValidator.validateInputNumber(numbers)) {
                    return numbers;
                }
                else {
                    Output.printInputErrorMessage();
                }
            } catch (InputMismatchException e){
                Output.printInputGuideMessage();
            }
        }

    }

    private static int getNextValidInt(){

        try{
            return scanner.nextInt();
        }
        catch (InputMismatchException e){
            scanner.nextLine();
            throw e;
        }
    }


}
