package Books;

import java.time.LocalDate;
import java.util.*;

import static java.time.temporal.ChronoUnit.DAYS;

public class BookRepository {

    private Set<Book> books;

    private Set<Book> initialize(){
        return new HashSet<>(Arrays.asList(
                new Book(1L, "Harry Potter", "JK Rowling"),
                new Book(2L, "Testy", "Kaczanowski"), new Book(3L, "Testy", "Kaczanowski"),
                new Book(4L, "Wladca Pierscieni", "Tolkien"),
                new Book(5L, "Wladca Pierscieni", "Tolkien"),
                new Book(6L, "Wladca Pierscieni", "Tolkien"),
                new Book(7L, "Anioly i demony", "Brown"),
                new Book(8L, "Effective Java", "Bloch"),
                new Book(9L, "Czysty kod", "Martin"),
                new Book(10L, "Czysty kod", "Martin"))
        );
    }

    public Optional<Book> borrowBook(String title, LocalDate borrowedTill) {
        Optional<Book> bookToBorrow = books.stream()
                .filter(book -> book.getTitle().equals(title))
                .filter(book -> book.getDateOfReturn() == null)
                .findAny();
        bookToBorrow.ifPresent(book -> book.setDateOfReturn(borrowedTill));
        return bookToBorrow;
    }

    public Long addBook(Book book) {
        Long id = generateNewId();
        book.setId(id);
        books.add(book);
        return id;
    }

    private Long generateNewId() {
        OptionalLong max = books.stream()
                .mapToLong(Book::getId)
                .max();
        return max.isPresent() ? max.getAsLong() + 1 : 1;
    }

    public boolean deleteBook(Long id) throws BookNotFoundException {
        Book bookToRemove = books.stream()
                .filter(book -> book.getId().equals(book))
                .filter(book -> book.getDateOfReturn() == null)
                .findFirst()
                .orElseThrow(() -> new BookNotFoundException("Book not found"));
        return books.remove(bookToRemove);
    }

    public Long returnBook(Long id) {
        Book bookToReturn = books.stream()
                .filter(book -> book.getId().equals(id))
                .findFirst()
                .orElseThrow(() -> new BookNotFoundException("Book not found"));
        long overdue = 0;
        if(LocalDate.now().isAfter(bookToReturn.getDateOfReturn() )){
            overdue = DAYS.between(LocalDate.now(), bookToReturn.getDateOfReturn());
        }
        bookToReturn.setDateOfReturn(null);
        return overdue;
    }
}
