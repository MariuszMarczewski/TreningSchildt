package WzorzecDecorator;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle();
        circle.draw();

        System.out.println("===================================");

        Shape redCircle = new RedShapeDecorator(new Circle());
        redCircle.draw();
    }
}
