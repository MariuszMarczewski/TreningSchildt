package enums;

public enum Car {
    HONDA(120),
    MITSUBISHI(200),
    VOLVO(130),
    FIAT(120),
    MAZDA(165),
    Subaru(113);

    private int speed;

    Car(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }
}
