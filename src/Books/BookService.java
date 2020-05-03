package Books;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Optional;

public class BookService {

    private BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public Optional<Book> borrowBook(String title){
        return bookRepository.borrowBook(title, LocalDate.now().plusDays(30));
    }

    public Long addBook(Book book){
        return bookRepository.addBook(book);
    }

    public boolean deleteBook(Long id){
        return bookRepository.deleteBook(id);
    }

    public Optional<Fine> returnBook(Long id){
        long overdue = bookRepository.returnBook(id);
        return overdue >= 1 ? Optional.of(new Fine(BigDecimal.ONE, overdue)) : Optional.empty();
    }
}
