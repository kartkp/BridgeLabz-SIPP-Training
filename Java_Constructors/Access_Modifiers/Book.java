package Java_Constructors.Access_Modifiers;

class Book {
    public String ISBN;
    protected String title;
    private String author;

    public Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }
}
class EBook extends Book {
    public EBook(String ISBN, String title, String author) {
        super(ISBN, title, author);
    }

    public void showDetails() {
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
        System.out.println("Author: " + getAuthor());
    }

    public static void main(String[] args) {
        EBook ebook = new EBook("978-1234567890", "Learn Java", "Sunil Sharma");
        ebook.showDetails();
        ebook.setAuthor("Dr. A. Sharma");
        System.out.println("Updated Author: " + ebook.getAuthor());
    }
}