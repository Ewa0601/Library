package pl.javastart.library.app;

class LibraryApp {

    private final static String APP_NAME = "Biblioteka v2.8";

    public static void main(String[] args) {
        System.out.println(APP_NAME);
        LibraryControl libraryControl = new LibraryControl();
        libraryControl.controlLoop();


//        books[1] = new Book("Java. Efektywne programowanie. Wydanie II", "Joshua Bloch",
//                2009, 352, "Helion", "9788324620845");
//        books[2] = new Book("SCJP Sun Certified Programmer for Java 6 Study Guide",
//                "Bert Bates, Katherine Sierra", 2008, 851,
//                "McGraw-Hill Osborne Media");
//        System.out.println("System może przechowywać do " + books.length + " książek");
    }
}
