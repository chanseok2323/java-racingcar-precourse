package racinggame.domain;

import racinggame.view.OutView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RacingGame {
    private List<Car> cars;
    private static final int MOVE_VALUE = 4;
    private int attemptCnt;

    public RacingGame() {
        cars = new ArrayList<>();
    }

    public List<Car> getCars() {
        return cars;
    }

    public void ready(List<String> carList, int attempt) {
        this.attemptCnt = attempt;
        for(int i=0; i<carList.size(); i++) {
            cars.add(new Car(carList.get(i)));
        }
    }

    public void start() {
        for(int i=0; i <= attemptCnt; i++) {
            move();
            i = getMaxPosition();
        }
    }

    private int getMaxPosition() {
        int position = 0;
        for(int i=0; i < cars.size(); i++) {
            position = Math.max(position, cars.get(i).getPosition());
        }
        return position;
    }

    public void move() {
         for (Car car : cars) {
            getDecide(car);
            OutView.viewCarDistance(car);
          }
        System.out.println();
     }

    private void getDecide(Car car) {
        if(RandomGenerator.createRandom() >= MOVE_VALUE) car.move();
    }

    public void getResult() {
        List<String> winners = getWinners();
        System.out.printf("최종 우승자는 %s 입니다.", String.join(",", winners));
    }

    public List<String> getWinners() {
        List<String> winner = new ArrayList<>();
        for(Car car : cars) {
            winner.add(getWinner(car));
        }
        winner.removeAll(Collections.singletonList(null));
        return winner;
    }

    private String getWinner(Car car) {
        return car.getPosition() == attemptCnt ? car.getName() : null;
    }
}
