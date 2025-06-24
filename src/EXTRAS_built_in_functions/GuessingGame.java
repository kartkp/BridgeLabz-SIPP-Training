package EXTRAS_built_in_functions;

import java.util.Scanner;
import java.util.Random;

public class GuessingGame {
    static Random random = new Random();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int low = 1, high = 100;
        while (true) {
            int guess = generateGuess(low, high);
            System.out.println("Is your number " + guess + "? (Enter: high/low/correct)");
            String response = scanner.nextLine();

            if (response.equalsIgnoreCase("correct")) {
                System.out.println("Yay! I guessed it!");
                break;
            } else if (response.equalsIgnoreCase("low")) {
                low = guess + 1;
            } else if (response.equalsIgnoreCase("high")) {
                high = guess - 1;
            }
        }
    }

    static int generateGuess(int low, int high) {
        return low + random.nextInt(high - low + 1);
    }
}
