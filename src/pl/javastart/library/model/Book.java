package pl.javastart.library.model;

public class Book extends Publication {
    //Pola
    private String author;
    private int pages;
    private String isbn;

    //konstruktor
    public Book(String title, String author, String publisher, int year, int pages, String isbn) {
        super(title, publisher, year);
        this.author = author;
        this.pages = pages;
        this.isbn = isbn;
    }

    //gettery i settery
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    //drukowanie informacji
    public void printInfo() {
        String info = getTitle() + "; " + author + "; " + getYear() +
                "; " + pages + "; " + getPublisher() + "; " + isbn;
        System.out.println(info);
    }
}
