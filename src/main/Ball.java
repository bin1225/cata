package main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

public class Ball {
    private List<Integer> numbers;

    public List<Integer> createBall(){
        Random random = new Random();
        numbers = new ArrayList<>();
        HashMap<Integer, Boolean> check = new HashMap<Integer, Boolean>();

        while(numbers.size()<GameConfiguration.BALL_SIZE){
            int number = random.nextInt(10);
            if(!check.containsKey(number)) {
                numbers.add(random.nextInt(10));
                check.put(number, true);
            }
        }
        return numbers;
    }
}
