package WzorzecDecorator;

public class WheelCarDecorator extends CarDecorator {
    public WheelCarDecorator(Car acceleratedCar) {
        super(acceleratedCar);
    }

    @Override
    public void accelerate(int speed) {
        super.accelerate(speed);
        changeWheels(acceleratedCar);
    }

    private void changeWheels(Car acceleratedCar) {
        System.out.println("Wheels change to: aluminium ones");
    }
}
