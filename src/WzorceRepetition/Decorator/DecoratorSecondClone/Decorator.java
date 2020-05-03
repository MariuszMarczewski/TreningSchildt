package WzorceRepetition.Decorator.DecoratorSecondClone;

public abstract class Decorator implements Tank {
    protected Tank tank;

    public Decorator(Tank tank) {
        this.tank = tank;
    }

    @Override
    public void shoot() {
        tank.shoot();
    }
}
