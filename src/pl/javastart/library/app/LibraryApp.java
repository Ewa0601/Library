package pl.javastart.library.app;

class LibraryApp {
    public static void main(String[] args) {
        final String appName = "Biblioteka v0.9";
        System.out.println(appName);
        LibraryControl libraryControl = new LibraryControl();
        libraryControl.controlLoop();

//        books[0] = new Book("W pustyni i w puszczy", "Henryk Sienkiewicz",
//                2010, 296, "Greg", "9788373271890");
//        books[1] = new Book("Java. Efektywne programowanie. Wydanie II", "Joshua Bloch",
//                2009, 352, "Helion", "9788324620845");
//        books[2] = new Book("SCJP Sun Certified Programmer for Java 6 Study Guide",
//                "Bert Bates, Katherine Sierra", 2008, 851,
//                "McGraw-Hill Osborne Media");
    }
}
