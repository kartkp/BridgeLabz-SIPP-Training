package Java_Constructors.Level1;

public class Book1 {
    private String title;
    private String author;
    private double price;
    private boolean available;

    public Book1(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.available = true;
    }

    public void borrowBook1() {
        if (available) {
            available = false;
            System.out.println("You have borrowed: " + title);
        } else {
            System.out.println("Sorry, " + title + " is already borrowed.");
        }
    }

    public void display() {
        System.out.println("Title: " + title + ", Author: " + author + ", Price: ₹" + price + ", Available: " + available);
    }

    public static void main(String[] args) {
        Book1 b1 = new Book1("Rich Dad Poor Dad", "Robert Kiyosaki", 299);
        b1.display();
        b1.borrowBook1();
        b1.borrowBook1();
    }
}
