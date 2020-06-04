package pl.javastart.library.model;

public class Book extends Publication {
    //Pola
    private String author;
    private int pages;
    private String isbn;

    //konstruktory
    public Book(int year, String title, String publisher, String author,
         int pages, String isbn) {
        this(year, title, publisher, author, pages);
        this.isbn = isbn;
    }

    public Book(int year, String title, String publisher, String author, int pages) {
        setTitle(title);
        setYear(year);
        setPublisher(publisher);
        this.author = author;
        this.pages = pages;
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
                "; " + pages + "; " + getPublisher();
        if (isbn != null)
            info = info + "; " + isbn;
        System.out.println(info);
    }
}
