package DynamicOnlineMarketplace;

class DiscountUtils {
    public static <T extends Product<?>> void applyDiscount(T product, double percent) {
        double discount = product.getPrice() * percent / 100;
        product.setPrice(product.getPrice() - discount);
    }
}
