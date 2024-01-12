package woowa.baseball.dto;

import java.util.Scanner;

public class GameInput {

    private final String inputString = "숫자를 입력해주세요 : ";
    private final String gameRestartString = "게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.";
    private final Scanner scanner = new Scanner(System.in);

    public int inputNum() {
        System.out.print(inputString);
        return scanner.nextInt();
    }

    public int inputRestart() {
        System.out.println(gameRestartString);
        return scanner.nextInt();
    }
}
