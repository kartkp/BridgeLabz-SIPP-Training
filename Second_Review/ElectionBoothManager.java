package Second_Review;

import java.util.Scanner;

public class ElectionBoothManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int votes1 = 0, votes2 = 0, votes3 = 0;

        while (true) {
            System.out.print("Enter age (or -1 to stop): ");
            int age = sc.nextInt();

            if (age == -1) {
                System.out.println("Voting closed.");
                break;
            }

            if (age >= 18) {
                System.out.println("Eligible to vote.");
                System.out.print("Enter your vote (1, 2, or 3): ");
                int vote = sc.nextInt();

                if (vote == 1) votes1++;
                else if (vote == 2) votes2++;
                else if (vote == 3) votes3++;
                else System.out.println("Invalid vote.");
            } else {
                System.out.println("Not eligible to vote.");
            }
            // System.out.println("---------------------------");
        }

        System.out.println("Vote Count:");
        System.out.println("Candidate 1: " + votes1);
        System.out.println("Candidate 2: " + votes2);
        System.out.println("Candidate 3: " + votes3);
        sc.close();
    }
}