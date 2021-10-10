package racinggame.domain;

import nextstep.utils.Randoms;

public class RandomGenerator {

    private static final int START_INDEX = 1;
    private static final int FINAL_INDEX = 9;

    public static int createRandom() {
        return Randoms.pickNumberInRange(START_INDEX, FINAL_INDEX);
    }
}
