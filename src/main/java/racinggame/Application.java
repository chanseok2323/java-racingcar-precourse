package racinggame;

import racinggame.domain.RacingGame;
import racinggame.view.InputView;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        // TODO 자동차 경주 게임 구현
        RacingGame racingGame = InputView.createRacingGame();
        racingGame.start();
        racingGame.getResult();
    }
}
