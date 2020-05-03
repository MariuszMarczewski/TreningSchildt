package WzorzecBuilder;

public class BookMain {
    public static void main(String[] args) {
        Book book = new Book.Builder()
                .id(1)
                .pages(100)
                .title("Tarantula")
                .build();

        System.out.println(book.getId());
        System.out.println(book.getTitle());
        System.out.println(book.getAuthor());
        System.out.println(book.getPages());
    }
}
