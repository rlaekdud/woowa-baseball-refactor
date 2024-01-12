package woowa.baseball.validator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import woowa.baseball.util.Judgement;
import woowa.baseball.util.validator.ResultValidator;

class ResultValidatorTest {

    ResultValidator resultValidator = new ResultValidator();

    @Test
    void validate() {
        // given
        int inputNum = 123;
        int answer = 125;

        // when
        Judgement[] judgements = resultValidator.validate(inputNum, answer);

        // then
        Assertions.assertEquals(Judgement.STRIKE, judgements[0]);
        Assertions.assertEquals(Judgement.STRIKE, judgements[1]);
        Assertions.assertEquals(Judgement.NOTHING, judgements[2]);
    }
}