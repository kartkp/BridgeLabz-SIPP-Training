import java.util.Scanner;
public class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int physics = sc.nextInt();
        int chemistry = sc.nextInt();
        int maths = sc.nextInt();

        double average = (physics + chemistry + maths) / 3.0;
        String grade, remark;

        if (average >= 90) {
            grade = "A+";
            remark = "Outstanding";
        } else if (average >= 80) {
            grade = "A";
            remark = "Excellent";
        } else if (average >= 70) {
            grade = "B+";
            remark = "Very Good";
        } else if (average >= 60) {
            grade = "B";
            remark = "Good";
        } else if (average >= 50) {
            grade = "C";
            remark = "Satisfactory";
        } else {
            grade = "F";
            remark = "Needs Improvement";
        }

        System.out.println("Average Marks: " + average);
        System.out.println("Grade: " + grade + " | Remarks: " + remark);
    }
}