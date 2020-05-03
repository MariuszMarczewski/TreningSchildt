package WzorceRepetition.Decorator.DecoratorClone;

public class RedBusDecorator extends Decorator {
    public RedBusDecorator(Bus bus) {
        super(bus);
    }

    @Override
    public void growl() {
        super.growl();
        extendBus(bus);
    }

    private void extendBus(Bus bus) {
        System.out.println("The bus got extended!");
    }
}
