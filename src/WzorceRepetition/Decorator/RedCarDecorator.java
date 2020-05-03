package WzorceRepetition.Decorator;

public class RedCarDecorator extends Decorator {

    public RedCarDecorator(Car car) {
        super(car);
    }

    @Override
    public void present() {
        super.present();
        paintRed(car);
    }

    private void paintRed(Car car) {
        System.out.println("The car got red-painted");
    }
}
