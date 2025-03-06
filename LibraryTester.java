public class LibraryTester {
    public static void main(String[] args) {
        BookShelf bs1 = new BookShelf('O');
        BookShelf bs2 = new BookShelf('T');
        System.out.println(bs1);
        System.out.println(bs2);
        Book b1= new Book("The Heart of the Betrayed","Crime");
        Book b2 = new Book("Our Hill of Stars","Fantasy");
        Book b3 = new Book("One of a Kind","Science Fiction");
        Book b4 = new Book("The Vision of Roses","Romance");
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);
        bs1.addBook(b1);
        bs1.addBook(b2);
        bs1.addBook(b3);
        bs1.addBook(b4);
        bs2.addBook(b1);
        bs2.addBook(b2);
        bs2.addBook(b3);
        bs2.addBook(b4);
        System.out.println(bs1);
        System.out.println(bs2);
        
    }
}
