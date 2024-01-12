package woowa.baseball.dto;

import woowa.baseball.util.Judgement;

public class GameOutput {

    private final String start = "숫자 야구 게임을 시작합니다.";
    private final String end = "3개의 숫자를 모두 맞히셨습니다! 게임 종료";

    public void printResult(int strikeCount, int ballCount) {

        if(strikeCount == 0 && ballCount == 0) {
            System.out.println(Judgement.NOTHING.getJudgement());
            return;
        }

        if(ballCount > 0) {
            System.out.print(ballCount);
            System.out.print(Judgement.BALL.getJudgement());
            System.out.print(" ");
        }

        if(strikeCount > 0) {
            System.out.print(strikeCount);
            System.out.print(Judgement.STRIKE.getJudgement());
        }

        System.out.println();
    }

    public void printStart() {
        System.out.println(start);
    }

    public void printEnd() {
        System.out.println(end);
    }
}
