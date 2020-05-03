package WzorceRepetition.Decorator.DecoratorSecondClone;

public class Main {
    public static void main(String[] args) {
        Tank tank = new ImprovedTank(new GermanTank());
        tank.shoot();
    }
}
