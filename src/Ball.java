import java.util.Random;

public class Ball {
    private static final int BALL_SIZE =3;
    private int[] numbers;

    public int[] createBall(){
        Random random = new Random();
        numbers = new int[BALL_SIZE];

        for(int i=0; i<BALL_SIZE; i++){
            numbers[i] = random.nextInt(10);
        }
        return numbers;
    }
}
