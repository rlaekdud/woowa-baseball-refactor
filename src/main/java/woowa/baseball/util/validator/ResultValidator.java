package woowa.baseball.util.validator;

import woowa.baseball.util.Judgement;

// strike, ball, nothing을 검증해 배열로 반환하는 클래스
public class ResultValidator {

    public Judgement[] validate(int inputNum, int answer) {
        int currentNum = 0;
        int validateNum = 0;

        Judgement[] judgements = new Judgement[3];

        for(int i = 0; i < 3; i++) {
            currentNum = getPosition(inputNum, i);
            validateNum = getPosition(answer, i);

            judgements[i] = (validatePosition(currentNum, validateNum, answer));
        }

        return judgements;
    }

    public int countStrike(Judgement[] judgements) {
        int strikeCount = 0;

        for(Judgement judgement : judgements) {
            if(judgement == Judgement.STRIKE) {
                strikeCount++;
            }
        }

        return strikeCount;
    }

    public int countBall(Judgement[] judgements) {
        int ballCount = 0;

        for(Judgement judgement : judgements) {
            if(judgement == Judgement.BALL) {
                ballCount++;
            }
        }

        return ballCount;
    }

    private Judgement validatePosition(int currentNum, int validateNum, int answer) {
        if(currentNum == validateNum) {
            return Judgement.STRIKE;
        }

        String currentNumStr = String.valueOf(currentNum);
        String answerStr = String.valueOf(answer);

        if(answerStr.contains(currentNumStr)) {
            return Judgement.BALL;
        }

        return Judgement.NOTHING;
    }

    private int getPosition(int num, int position) {
        String numStr = String.valueOf(num);
        return Integer.parseInt(String.valueOf(numStr.charAt(position)));
    }
}
