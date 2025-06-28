import java.util.Scanner;
public class Online_Quiz_Application {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] qs = {
				"1. Java is a?\nA. Platform-independent\nB. OOP\nC. Secure\nD. All",
				"2. Size of int in Java?\nA. 2 bytes\nB. 4 bytes\nC. 8 bytes\nD. OS dependent",
	            "3. Keyword to inherit class?\nA. implement\nB. super\nC. extends\nD. this",
	            "4. JVM stands for?\nA. Java Virtual Machine\nB. Java Verified Mode\nC. Java Variable Method\nD. None",
	            "5. Fixed loop usage?\nA. while\nB. do-while\nC. for\nD. if"
	         };

        char[] ans = {'D', 'C', 'C', 'A', 'C'};
        int score = 0;

        for (int i = 0; i < 5; i++) {
            System.out.println(qs[i]);
            System.out.print("your answer: ");
            char user = Character.toUpperCase(sc.next().charAt(0));

            switch (user) {
                case 'A': case 'B': case 'C': case 'D':
                    if (user == ans[i]) score++;
                    break;
                default:
                    System.out.println("invalid input");
            }
            System.out.println();
        }
        System.out.println("you got " + score + " out of 5");
        sc.close();
    }
}