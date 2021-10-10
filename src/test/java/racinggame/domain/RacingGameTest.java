package racinggame.domain;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RacingGameTest {

    @Test
    void 객체생성시Car의거리가0으로초기화된다() {
        RacingGame racingGame = new RacingGame();
        List<String> cars = new ArrayList<>();
        cars.add("pobi");
        cars.add("crong");
        cars.add("honux");

        racingGame.ready(cars, 5);
        List<Car> list = racingGame.getCars();
        Assertions.assertThat(list.get(0).getPosition()).isEqualTo(0);
        Assertions.assertThat(list.get(1).getPosition()).isEqualTo(0);
        Assertions.assertThat(list.get(2).getPosition()).isEqualTo(0);
    }
}