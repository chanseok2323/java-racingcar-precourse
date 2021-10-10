package racinggame.common;

public class Validator {

    private static final int NAME_MIN_SIZE = 0;
    private static final int NAME_MAX_SIZE = 5;

    public static void validationCarName(String name) throws IllegalAccessException {
        if(name.length() <= NAME_MIN_SIZE || name.length() > NAME_MAX_SIZE) throw new IllegalAccessException(CommonErrorMessage.MAX_SIZE_CAT_NAME_MSG.getMessage());
        if(name == null || name.trim().equals("")) throw new IllegalAccessException(CommonErrorMessage.NAME_NULL_MSG.getMessage());
    }

    public static void validationAttempt(String attempt) throws IllegalAccessException {
        if(attempt.matches("[+-]?\\d*(\\.\\d+)?") == false) throw new IllegalAccessException(CommonErrorMessage.ATTEMPT_INT_ERROR_MSG.getMessage());
    }
}
