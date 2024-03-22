package main;

import java.util.*;

public class Computer {
    private List<Integer> numbers;

    public List<Integer> createRandomNumbers(){
        Random random = new Random();
        numbers = new ArrayList<>();
        HashMap<Integer, Boolean> check = new HashMap<>();

        while(numbers.size()<GameConfiguration.BALL_SIZE){
            int number = random.nextInt(10);
            if(!check.containsKey(number)) {
                numbers.add(random.nextInt(10));
                check.put(number, true);
            }
        }
        return numbers;
    }

    public Hint compareNumbers(List<Integer> expectNumbers, List<Integer> guessNumbers){
        int strike =0, ball=0;
        for(int i=0; i<guessNumbers.size(); i++){
            for(int j=0; j<expectNumbers.size(); j++){
                if(guessNumbers.get(i).equals(expectNumbers.get(j))){
                    if(i==j) strike++;
                    else ball++;
                }
            }
        }
        return new Hint(strike, ball);
    }
}
