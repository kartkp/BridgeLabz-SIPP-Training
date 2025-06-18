package Day4_Methods;

import java.util.*;

public class GeometryCalc {

    public static double distance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public static double[] line(double x1, double y1, double x2, double y2) {
        double m = (y2 - y1) / (x2 - x1);
        double b = y1 - m * x1;
        return new double[]{m, b};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();

        double d = distance(x1, y1, x2, y2);
        System.out.printf("Distance: %.2f\n", d);

        if (x1 != x2) {
            double[] eq = line(x1, y1, x2, y2);
            System.out.printf("y = %.2fx + %.2f\n", eq[0], eq[1]);
        } else {
            System.out.println("vertical line. slope undefined.");
        }
    }
}

