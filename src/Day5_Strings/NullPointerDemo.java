package Day5_Strings;

public class NullPointerDemo {

    public static void generateException() {
        String text = null;
        System.out.println("Length: " + text.length());
    }

    public static void handleException() {
        String text = null;
        try {
            System.out.println("Length: " + text.length());
        } catch (NullPointerException e) {
            System.out.println("Caught it, the text was null.");
        }
    }

    public static void main(String[] args) {

        try {
            generateException();
        } catch (NullPointerException e) {
            System.out.println("Got it in main: " + e.getMessage());
        }

        handleException();
    }
}
