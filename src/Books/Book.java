package Books;

import java.time.LocalDate;
import java.util.Objects;

public class Book {
    private Long id;
    private String title;
    private String author;
    private LocalDate dateOfReturn;

    public Book(String author, String title) {
        this.author = author;
        this.title = title;
    }

    public Book(Long id, String title, String author) {
        this.id = id;
        this.author = author;
        this.title = title;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public LocalDate getDateOfReturn() {
        return dateOfReturn;
    }

    public void setDateOfReturn(LocalDate dateOfReturn) {
        this.dateOfReturn = dateOfReturn;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(id, book.id) &&
                Objects.equals(title, book.title) &&
                Objects.equals(author, book.author) &&
                Objects.equals(dateOfReturn, book.dateOfReturn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, author, dateOfReturn);
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", dateOfReturn=" + dateOfReturn +
                '}';
    }
}
