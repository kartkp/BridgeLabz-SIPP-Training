package Java_Inheritance;

class Book {
    String title;
    int publicationYear;
    Book(String title, int publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
    }
    void displayInfo() {
        System.out.println(title + " " + publicationYear);
    }
}

class Author extends Book {
    String name;
    String bio;
    Author(String title, int publicationYear, String name, String bio) {
        super(title, publicationYear);
        this.name = name;
        this.bio = bio;
    }
    void displayInfo() {
        super.displayInfo();
        System.out.println(name + " " + bio);
    }
}

public class LibraryManagement {
    public static void main(String[] args) {
        Author a = new Author("Java Fundamentals", 2024, "John Doe", "Expert Java Developer");
        a.displayInfo();
    }
}

