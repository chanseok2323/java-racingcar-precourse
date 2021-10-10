package racinggame.domain;


public class Car {

    private Name name;
    private Position position;

    public Car(String name) {
        this.name = new Name(name);
        this.position = new Position(0);
    }

    public String getName() {
        return name.getName();
    }

    public int getPosition() {
        return position.getValue();
    }

    public void move() {
        position.movePosition();
    }
}

class Name {
    private final String name;

    public Name(String name)  {
        this.name = name;
    }

    public String getName() {
        return name;
    }



}