package JavaStreams;

import java.io.*;

public class DataStream {
    public static void main(String[] args) throws IOException {
        DataOutputStream dos = new DataOutputStream(new FileOutputStream("students.dat"));
        dos.writeInt(101);
        dos.writeUTF("Alice");
        dos.writeDouble(8.9);

        dos.writeInt(102);
        dos.writeUTF("Bob");
        dos.writeDouble(9.4);
        dos.close();

        DataInputStream dis = new DataInputStream(new FileInputStream("students.dat"));
        while (dis.available() > 0) {
            int roll = dis.readInt();
            String name = dis.readUTF();
            double gpa = dis.readDouble();
            System.out.println(roll + " " + name + " " + gpa);
        }
        dis.close();
    }
}
