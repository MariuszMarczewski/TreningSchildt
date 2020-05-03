package WzorceRepetition.Decorator;

public class Main {
    public static void main(String[] args) {
        Car car = new BigCar();
        car.present();

        System.out.println("============================================");

        Car car1 = new RedCarDecorator(new BigCar());
        car1.present();

    }
}
