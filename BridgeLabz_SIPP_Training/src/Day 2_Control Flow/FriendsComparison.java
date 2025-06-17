import java.util.Scanner;
public class FriendsComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age1 = sc.nextInt(), height1 = sc.nextInt(); // Amar
        int age2 = sc.nextInt(), height2 = sc.nextInt(); // Akbar
        int age3 = sc.nextInt(), height3 = sc.nextInt(); // Anthony

        int youngestAge = Math.min(age1, Math.min(age2, age3));
        int tallestHeight = Math.max(height1, Math.max(height2, height3));

        System.out.println("Youngest Age: " + youngestAge);
        System.out.println("Tallest Height: " + tallestHeight);
    }
}
