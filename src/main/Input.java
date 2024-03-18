package main;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Input {


    private static Scanner scanner = new Scanner(System.in);
    public static int[] getThreeNumber(){
        int[] numbers = new int[3];
        while(true){
            for(int i=0; i<3; i++){
                numbers[i] = scanner.nextInt();
            }
            if(validNumberUnique(numbers)) return numbers;
        }
    }

    private static boolean validNumberUnique(int[] numbers){
        Set<Integer> set = new HashSet<>();
        for(int num: numbers){
            set.add(num);
        }
        return set.size() == numbers.length;
    }
}
