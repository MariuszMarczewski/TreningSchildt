package WzorzecDecorator.secondClone;

public class FrameBookDecorator extends BookDecorator {
    public FrameBookDecorator(Book decoratedBook) {
        super(decoratedBook);
    }

    @Override
    public void smell() {
        super.smell();
        frame(decoratedBook);
    }

    private void frame(Book decoratedBook) {
        System.out.println("A book was framed");
    }
}
