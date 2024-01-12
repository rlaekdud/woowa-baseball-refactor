package woowa.baseball.global;

public enum ErrorMessage {
    NOT_THREE_DIGITS("세자리 수가 아닙니다."),
    NOT_NUMBER("숫자가 아닙니다."),
    DUPLICATED_NUMBER("중복된 숫자가 있습니다."),
    NOT_IN_RANGE("1~9 사이의 숫자가 아닙니다."),
    WRONG_STATUS("숫자가 1이나 2가 아닙니다.");

    private String message;

    ErrorMessage(String s) {
        this.message = s;
    }

    public String getMessage() {
        return message;
    }
}
