package Day3_ArrayPractice;
import java.util.Scanner;
public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        int[][] marks = new int[n][3];
        double[] percentage = new double[n];
        String[] grades = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter marks for Student " + (i + 1));
            for (int j = 0; j < 3; j++) {
                String subject = j == 0 ? "Physics" : j == 1 ? "Chemistry" : "Maths";
                System.out.print(subject + ": ");
                int mark = sc.nextInt();

                if (mark < 0 || mark > 100) {
                    System.out.println("Invalid mark! Please enter between 0-100.");
                    j--;
                } else {
                    marks[i][j] = mark;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            percentage[i] = total / 3.0;

            if (percentage[i] >= 80)
                grades[i] = "A";
            else if (percentage[i] >= 70)
                grades[i] = "B";
            else if (percentage[i] >= 60)
                grades[i] = "C";
            else if (percentage[i] >= 50)
                grades[i] = "D";
            else if (percentage[i] >= 40)
                grades[i] = "E";
            else
                grades[i] = "R";
        }

        System.out.println("\nStudent\tPhysics\tChem\tMaths\t%\tGrade");
        for (int i = 0; i < n; i++) {
            System.out.printf("  %d\t  %d\t  %d\t  %d\t%.2f\t%s\n", 
                i + 1, marks[i][0], marks[i][1], marks[i][2], percentage[i], grades[i]);
        }

        sc.close();
    }
}
