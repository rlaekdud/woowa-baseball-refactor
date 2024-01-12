package woowa.baseball.util.validator;

import woowa.baseball.global.ErrorMessage;

// 1~9까지의 숫자로 이루어진 세자리 수인지 검증하는 클래스
public class InputValidator {
    public void validate(int num) {

        if(num < 100 || num > 999) {
            System.out.println(ErrorMessage.NOT_THREE_DIGITS.getMessage());
            throw new IllegalArgumentException(ErrorMessage.NOT_THREE_DIGITS.getMessage());
        }

        if(isDuplicate(num)) {
            System.out.println(ErrorMessage.DUPLICATED_NUMBER.getMessage());
            throw new IllegalArgumentException(ErrorMessage.DUPLICATED_NUMBER.getMessage());
        }

        if(isContainZero(num)) {
            System.out.println(ErrorMessage.NOT_IN_RANGE.getMessage());
            throw new IllegalArgumentException(ErrorMessage.NOT_IN_RANGE.getMessage());
        }
    }

    public void validateGameStatus(int gameStatus) {
        if(gameStatus != 1 && gameStatus != 2) {
            System.out.println(ErrorMessage.WRONG_STATUS);
            throw new IllegalArgumentException(String.valueOf(ErrorMessage.WRONG_STATUS));
        }
    }

    private boolean isDuplicate(int num) {
        String numStr = String.valueOf(num);
        return numStr.charAt(0) == numStr.charAt(1) || numStr.charAt(0) == numStr.charAt(2) || numStr.charAt(1) == numStr.charAt(2);
    }

    private boolean isContainZero(int num) {
        String numStr = String.valueOf(num);
        return numStr.contains("0");
    }
}
