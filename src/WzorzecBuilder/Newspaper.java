package WzorzecBuilder;

public class Newspaper {
    private String title;
    private Integer pages;
    private String editor;

    public static class Builder {
        private String title = null;
        private Integer pages = 0;
        private String editor = null;

        public Builder title(String title){
            this.title = title;
            return this;
        }

        public Builder pages(Integer pages){
            this.pages = pages;
            return this;
        }

        public Builder editor(String editor){
            this.editor = editor;
            return this;
        }

        public Newspaper build(){
            return new Newspaper(this);
        }
    }

    private Newspaper(Builder builder){
        this.title = builder.title;
        this.pages = builder.pages;
        this.editor = builder.editor;
    }

    public String getTitle() {
        return title;
    }

    public Integer getPages() {
        return pages;
    }

    public String getEditor() {
        return editor;
    }
}
