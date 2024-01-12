package woowa.baseball.service;

import woowa.baseball.dto.GameInput;
import woowa.baseball.dto.GameOutput;
import woowa.baseball.util.RandomNumberGenerator;
import woowa.baseball.util.validator.InputValidator;
import woowa.baseball.util.Judgement;
import woowa.baseball.util.validator.ResultValidator;

import java.util.Arrays;

public class GameService {

    private final RandomNumberGenerator randomNumberGenerator = new RandomNumberGenerator();
    private final GameInput gameInput =  new GameInput();
    private final GameOutput gameOutput = new GameOutput();
    private final InputValidator inputValidator = new InputValidator();
    private final ResultValidator resultValidator = new ResultValidator();

    public void play() {
        int randomNumber = randomNumberGenerator.generate();
        System.out.println("randomNumber = " + randomNumber);
        Judgement[] judgements = new Judgement[3];
        int strikeCount = 0;
        int ballCount;

        while(strikeCount != 3) {

            Arrays.fill(judgements, Judgement.NOTHING);

            int inputNumber = gameInput.inputNum();

            inputValidator.validate(inputNumber);
            judgements = resultValidator.validate(inputNumber, randomNumber);

            strikeCount = resultValidator.countStrike(judgements);
            ballCount = resultValidator.countBall(judgements);

            gameOutput.printResult(strikeCount, ballCount);
        }
        gameOutput.printEnd();
    }
}
