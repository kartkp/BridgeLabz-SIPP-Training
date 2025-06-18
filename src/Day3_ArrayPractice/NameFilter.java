package Day3_ArrayPractice;

public class NameFilter {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int[] age = new int[3];
        int[] height = new int[3];
        String[] names = {"Amar", "Akbar", "Anthony"};
        

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age of " + names[i] + ": ");
            age[i] = sc.nextInt();
            System.out.print("Enter height of " + names[i] + ": ");
            height[i] = sc.nextInt();
        }

        int youngIndex = 0, tallIndex = 0;
        for (int i = 1; i < 3; i++) {
            if (age[i] < age[youngIndex]) youngIndex = i;
            if (height[i] > height[tallIndex]) tallIndex = i;
        }

        System.out.println("Youngest: " + names[youngIndex]);
        System.out.println("Tallest: " + names[tallIndex]);
        sc.close();
    }
}