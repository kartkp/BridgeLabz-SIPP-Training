package JavaStreams;

import java.io.*;

public class UserInputToFile {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             FileWriter writer = new FileWriter("userinfo.txt")) {

            System.out.print("Enter your name: ");
            String name = reader.readLine();

            System.out.print("Enter your age: ");
            String age = reader.readLine();

            System.out.print("Favorite programming language: ");
            String lang = reader.readLine();

            writer.write("Name: " + name + "\nAge: " + age + "\nLanguage: " + lang);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
