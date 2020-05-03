package WzorzecDecorator.secondClone;

public abstract class BookDecorator implements Book {
    protected Book decoratedBook;

    public BookDecorator(Book decoratedBook) {
        this.decoratedBook = decoratedBook;
    }

    public void smell(){
        decoratedBook.smell();
    }
}
