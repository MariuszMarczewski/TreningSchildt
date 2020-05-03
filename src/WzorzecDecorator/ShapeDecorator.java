package WzorzecDecorator;

public abstract class ShapeDecorator implements WzorzecDecorator.Shape {
    protected WzorzecDecorator.Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape) {
        this.decoratedShape = decoratedShape;
    }

    public void draw(){
        decoratedShape.draw();
    }
}
