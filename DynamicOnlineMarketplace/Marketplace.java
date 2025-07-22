package DynamicOnlineMarketplace;

public class Marketplace {
    public static void main(String[] args) {

        Category books = new Category("Books");
        Category gadgets = new Category("Gadgets");

        Product<Category> book1 = new Product<>("Java Programming", 500, books);
        Product<Category> gadget1 = new Product<>("Smartwatch", 2000, gadgets);

        System.out.println("Before discount:");
        System.out.println(book1.getName() + ": Rs." + book1.getPrice());
        System.out.println(gadget1.getName() + ": Rs." + gadget1.getPrice());

        DiscountUtils.applyDiscount(book1, 10);
        DiscountUtils.applyDiscount(gadget1, 20);

        System.out.println("\nAfter discount:");
        System.out.println(book1.getName() + ": Rs." + book1.getPrice());
        System.out.println(gadget1.getName() + ": Rs." + gadget1.getPrice());
    }
}
