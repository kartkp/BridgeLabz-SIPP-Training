public class ReverseStringUsingStringBuilder {
    public static String reverse(String s) {
        return new StringBuilder(s).reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(reverse("hello"));
    }
}
