package racinggame.view;

import racinggame.domain.Car;
import racinggame.domain.RacingGame;

public class OutView {

    public static void viewRacingGame(RacingGame game) {

    }

    public static void viewCarDistance(Car car) {
        System.out.print(car.getName() + " : ");
        for (int i=0; i < car.getPosition(); i++) {
            System.out.print("-");
        }
        System.out.println();
    }
}

