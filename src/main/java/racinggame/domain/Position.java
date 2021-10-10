package racinggame.domain;

public class Position {
    private int value;

    public Position(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void movePosition() {
        value++;
    }
}
