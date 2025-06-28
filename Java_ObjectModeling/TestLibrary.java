package Java_ObjectModeling;

import java.util.ArrayList;

class Book {
    String title, author;
    Book(String t, String a) {
        title = t;
        author = a;
    }
}
class Library {
    String name;
    ArrayList<Book> books = new ArrayList<>();
    Library(String n) { name = n; }

    void addBook(Book b) {
        books.add(b);
    }
}
public class TestLibrary {
    public static void main(String[] args) {
        Book b1 = new Book("Harry Potter", "J.K. Rowling");
        Book b2 = new Book("2 States", "Chetan Bhagat");

        Library lib1 = new Library("City Library");
        Library lib2 = new Library("Town Library");
        lib1.addBook(b1);
        lib2.addBook(b1);
        lib2.addBook(b2);
    }
}