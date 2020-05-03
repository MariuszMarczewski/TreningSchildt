package WzorzecDecorator;

public class CarMain {
    public static void main(String[] args) {

        Car bigCar = new BigCar();
        bigCar.accelerate(10);

        System.out.println("===========================================");

        Car bigAluCar = new WheelCarDecorator(new BigCar());
        bigAluCar.accelerate(20);

        System.out.println("===========================================");

    }
}
