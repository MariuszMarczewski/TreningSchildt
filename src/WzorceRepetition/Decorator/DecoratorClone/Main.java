package WzorceRepetition.Decorator.DecoratorClone;

public class Main {
    public static void main(String[] args) {
        Bus bus = new RedBus();
        bus.growl();

        System.out.println("===================================================");

        Bus newBus = new RedBusDecorator(new BlueBus());
        newBus.growl();


    }
}
