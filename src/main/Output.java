package main;

public class Output {

    private static final String GAME_START_MESSAGE = "숫자야구 게임을 시작합니다.";
    private static final String INPUT_GUIDE_MESSAGE = "서로 다른 숫자 3개를 입력하세요.";
    public static void printGameStartMessage(){
        System.out.println(GAME_START_MESSAGE);
    }

    public static void printInputGuideMessage(){
        System.out.println(INPUT_GUIDE_MESSAGE);
    }
}
