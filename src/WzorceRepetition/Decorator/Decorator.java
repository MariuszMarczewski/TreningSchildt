package WzorceRepetition.Decorator;

public abstract class Decorator implements Car {

    protected Car car;

    public Decorator(Car car) {
        this.car = car;
    }

    @Override
    public void present() {
        car.present();
    }
}
