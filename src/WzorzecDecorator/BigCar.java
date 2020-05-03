package WzorzecDecorator;

public class BigCar implements Car {
    @Override
    public void accelerate(int speed) {
        System.out.println("Speed increased by: " + speed);
    }
}
