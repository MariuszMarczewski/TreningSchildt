package WzorzecDecorator;

public class FancyCar implements Car {
    @Override
    public void accelerate(int speed) {
        System.out.println("Speed increased by: " + speed);
    }
}
