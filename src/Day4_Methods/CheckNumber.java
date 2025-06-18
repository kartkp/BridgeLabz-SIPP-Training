package Day4_Methods;

import java.util.*;

public class CheckNumber {
    public static int checkSign(int num) {
        if (num > 0) return 1;
        else if (num < 0) return -1;
        else return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = checkSign(n);
        System.out.println("Result: " + result);
    }
}
