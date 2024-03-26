package main;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

@DisplayName("컴퓨터 테스트")
class ComputerTest {
    private Computer computer;
    List<Integer> numbers;
    @BeforeEach
    void beforeEach() {
        computer = new Computer();
        numbers = computer.createRandomNumbers();
    }
    @DisplayName("중복되지 않는 랜덤숫자를 생성한다.")
   @Test
    void testRandomNumberGenerationUnique() {
       HashMap<Integer, Boolean> check = new HashMap<Integer, Boolean>();
        for(int number: numbers){
            if(check.containsKey(number)){
                Assertions.assertTrue(false, "중복 숫자 생성");
            }
            else{
                check.put(number, true);
            }
        }
        Assertions.assertTrue(true);
   }

   @DisplayName("게임설정 개수만큼 랜덤숫자를 생성한다.")
   @Test
    void testRandomNumberGenerationCount(){
        Assertions.assertEquals(GameConfiguration.BALL_SIZE, numbers.size());
   }

   @DisplayName("지정 범위에 속하는 랜덤숫자를 생성한다.")
   @Test
    void testRandomNumberGenerationInRange(){
        for(int number: numbers){
            Assertions.assertTrue(number>=GameConfiguration.NUMBER_MIN && number<GameConfiguration.NUMBER_MAX);
        }
   }

   @DisplayName("동일한 숫자가 한 개도 없는 경우 낫싱")
   @Test
    void testCompareNumbersReturnNothing(){
        List<Integer> expectNumbers = Arrays.asList(1,2,3);
        List<Integer> guessNumbers = Arrays.asList(4,5,6);

       Hint hint = computer.compareNumbers(expectNumbers, guessNumbers);

       Assertions.assertEquals(hint.toString(), "낫싱");
   }


   @DisplayName("위치와 숫자가 같은 경우 스트라이크")
    @Test
    void testCompareNumbersReturnOneStrike(){
        List<Integer> expectNumbers = Arrays.asList(1,2,6);
        List<Integer> guessNumbers = Arrays.asList(4,5,6);

        Hint hint = computer.compareNumbers(expectNumbers, guessNumbers);

        Assertions.assertEquals(hint.toString(), "1 스트라이크");
    }

    @DisplayName("동일한 숫자가 위치는 다른 경우 볼")
    @Test
    void testCompareNumbersReturnOneBall(){
        List<Integer> expectNumbers = Arrays.asList(1,2,3);
        List<Integer> guessNumbers = Arrays.asList(3,5,6);

        Hint hint = computer.compareNumbers(expectNumbers, guessNumbers);

        Assertions.assertEquals(hint.toString(), "1 볼");
    }

    @DisplayName("스트라이크와 볼이 같이 존재")
    @Test
    void testCompareNumberReturnOneStrikeOneBall(){
        List<Integer> expectNumbers = Arrays.asList(1,2,3);
        List<Integer> guessNumbers = Arrays.asList(3,2,1);

        Hint hint = computer.compareNumbers(expectNumbers, guessNumbers);

        Assertions.assertEquals(hint.toString(), "1 스트라이크 2 볼");
    }





}