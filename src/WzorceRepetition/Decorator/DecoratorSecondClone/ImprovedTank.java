package WzorceRepetition.Decorator.DecoratorSecondClone;

public class ImprovedTank extends Decorator {
    public ImprovedTank(Tank tank) {
        super(tank);
    }

    @Override
    public void shoot() {
        super.shoot();
        improve(tank);
    }

    private void improve(Tank tank) {
        System.out.println("The tank has been equipped with a more powerful barrel");
    }
}
