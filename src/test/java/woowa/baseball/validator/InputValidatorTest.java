package woowa.baseball.validator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import woowa.baseball.util.validator.InputValidator;

import static org.junit.jupiter.api.Assertions.*;

class InputValidatorTest {

    private InputValidator inputValidator = new InputValidator();

    @Test
    @DisplayName("입력값이 3자리 숫자가 아닐 경우 예외 발생")
    void not_three_digits() {
        // given
        String fourDigits = "1234";

        // when & then
        assertThrows(IllegalArgumentException.class, () -> {
            inputValidator.validate(fourDigits);
        });
    }

    @Test
    @DisplayName("입력값이 숫자가 아닐 때 예외 발생")
    void not_number() {
        // given
        String notNumber = "hello";

        // when & then
        assertThrows(IllegalArgumentException.class, () -> {
            inputValidator.validate(notNumber);
        });
    }

    @Test
    @DisplayName("입력값에 중복된 숫자가 있을 때 예외 발생")
    void duplicated_number() {
        // given
        String duplicatedNumber = "224";

        // when & then
        assertThrows(IllegalArgumentException.class, () -> {
            inputValidator.validate(duplicatedNumber);
        });
    }

    @Test
    @DisplayName("입력값에 0이 포함될 때 예외 발생")
    void not_in_range() {
        // given
        String zero_num = "012";

        // when & then
        assertThrows(IllegalArgumentException.class, () -> {
            inputValidator.validate(zero_num);
        });
    }
}