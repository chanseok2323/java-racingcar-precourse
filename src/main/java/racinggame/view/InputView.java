package racinggame.view;

import nextstep.utils.Console;
import racinggame.common.Validator;
import racinggame.domain.RacingGame;

import java.util.ArrayList;
import java.util.List;

public class InputView {

    public static RacingGame createRacingGame() {
        List<String> carList = getCarsName();
        int attemptCnt = getAttempt();
        RacingGame racingGame = startRacingGame(carList, attemptCnt);
        return racingGame;
    }

    private static int getAttempt() {
        System.out.println("시도할 회수는 몇회인가요?");
        int attemptCnt = getAttemptCnt();
        return attemptCnt;
    }

    private static List<String> getCarsName() {
        System.out.println("경주할 자통자 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분");
        String input = Console.readLine();
        List<String> carList;
        try {
            carList = getCarList(input);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return getCarsName();
        }
        return carList;
    }

    private static RacingGame startRacingGame(List<String> carList, int attempt){
        RacingGame racingGame = new RacingGame();
        racingGame.ready(carList, attempt);
        return racingGame;
    }

    private static List<String> getCarList(String input) throws IllegalAccessException {
        List<String> result = new ArrayList<>();
        for(String car : input.split(",")) {
            validationCarName(car);
            result.add(car);
        }
        return result;
    }

    private static int getAttemptCnt() {
        String input = "";
        try {
           input = Console.readLine();
           validationAttept(input);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return getAttempt();
        }
        return Integer.parseInt(input);
    }

    private static void validationCarName(String value) throws IllegalAccessException {
        Validator.validationCarName(value);
    }

    private static void validationAttept(String value) throws IllegalAccessException {
        Validator.validationAttempt(value);
    }
}
