package WzorzecBuilder;

public class Book {
    private Integer id;
    private String title;
    private String author;
    private Integer pages;

    public static class Builder{
        private Integer id = 0;
        private String title = null;
        private String author = null;
        private Integer pages = 0;

        public Builder id(Integer id){
            this.id = id;
            return this;
        }

        public Builder title(String title){
            this.title = title;
            return this;
        }

        public Builder author(String author){
            this.author = author;
            return this;
        }

        public Builder pages(Integer pages){
            this.pages = pages;
            return this;
        }

        public Book build(){
            return new Book(this);
        }
    }

    private Book(Builder builder){
        this.id = builder.id;
        this.title = builder.title;
        this.author = builder.author;
        this.pages = builder.pages;
    }

    public Integer getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public Integer getPages() {
        return pages;
    }
}
