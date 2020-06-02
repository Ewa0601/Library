package pl.javastart.library.model;

public class Library {
    private final static int MAX_BOOKS = 1000;
    private Book[] books = new Book[MAX_BOOKS];
    private int booksNumber;

    public void addBook(Book book) {
        if (booksNumber < MAX_BOOKS) {
            books[booksNumber] = book;
            booksNumber++;
        } else {
            System.out.println("Maksymalna ilość książek została osiągnięta");
        }
    }

    public void printBooks() {
        if (booksNumber == 0) {
            System.out.println("Brak książek w bibliotece");
        }

        for (int i = 0; i < booksNumber; i++) {
            books[i].printInfo();
        }
    }

//        System.out.println("System może przechowywać do " + books.length + " książek");
}
