package racinggame.common;

public enum CommonErrorMessage {
    MAX_SIZE_CAT_NAME_MSG("[ERROR] 자동차의 이름은 1글자 이상, 5글자 이하여야만 합니다"),
    NAME_NULL_MSG("[ERROR] 자동차 이름을 입력해주세요."),
    ATTEMPT_INT_ERROR_MSG("[ERROR] 횟수는 숫자만 입력해주세요.");

    private String message;

    CommonErrorMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
