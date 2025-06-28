package Java_staticandfinalkey;

class Book {
    static String libraryName = "Central Library";
    final String isbn;
    String title;
    String author;

    Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    static void displayLibraryName() {
        System.out.println("Library: " + libraryName);
    }

    void displayDetails() {
        if (this instanceof Book) {
            System.out.println("Title: " + title + ", Author: " + author + ", ISBN: " + isbn);
        }
    }

    public static void main(String[] args) {
        Book.displayLibraryName();
        Book b1 = new Book("Java Basics", "John", "ISBN123");
        Book b2 = new Book("Python 101", "Nina", "ISBN456");
        b1.displayDetails();
        b2.displayDetails();
    }
}
