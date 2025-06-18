package Day4_Methods;

import java.util.*;

public class TriangularRun {
    public static int findRounds(double a, double b, double c) {
        double perimeter = a + b + c;
        double distance = 5000; // 5km in meters
        return (int)Math.ceil(distance / perimeter);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double s1 = sc.nextDouble();
        double s2 = sc.nextDouble();
        double s3 = sc.nextDouble();
        int rounds = findRounds(s1, s2, s3);
        System.out.println("Rounds needed: " + rounds);
    }
}
