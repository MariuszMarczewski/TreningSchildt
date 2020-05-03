package WzorzecDecorator;

public abstract class CarDecorator implements Car {
    protected Car acceleratedCar;

    public CarDecorator(Car acceleratedCar) {
        this.acceleratedCar = acceleratedCar;
    }

    public void accelerate(int speed){
        acceleratedCar.accelerate(speed);
    }
}
