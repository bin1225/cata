package main;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class InputValidator {

    public static boolean validateInputNumber(List<Integer> numbers){
        return validateNumberCount(numbers) &&
                validateNumberUnique(numbers) &&
                validateNumberInRange(numbers);

    }

    private static boolean validateNumberCount(List<Integer> numbers){
        return numbers.size() == GameConfiguration.BALL_SIZE;
    }
    private static boolean validateNumberUnique(List<Integer> numbers){
        Set<Integer> set = new HashSet<>();
        for(int num: numbers){
            set.add(num);
        }
        return set.size() == numbers.size();
    }

    private static boolean validateNumberInRange(List<Integer> numbers){
        for(int num: numbers){
            if(num <0 || num>9) return false;
        }
        return true;
    }
}
