package hw009.task003.models;

public class Book {
    private String title;
    private int amountOfPages;
    private String author;

    public Book(String title, int amountOfPages, String author) {
        this.title = title;
        this.amountOfPages = amountOfPages;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getAmountOfPages() {
        return amountOfPages;
    }

    public void setAmountOfPages(int amountOfPages) {
        this.amountOfPages = amountOfPages;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", amountOfPages=" + amountOfPages +
                ", author='" + author + '\'' +
                '}';
    }
}
