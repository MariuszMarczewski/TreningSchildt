package WzorceRepetition.Decorator.DecoratorClone;

public abstract class Decorator implements Bus {
    protected Bus bus;

    public Decorator(Bus bus) {
        this.bus = bus;
    }

    @Override
    public void growl() {
        bus.growl();
    }
}
