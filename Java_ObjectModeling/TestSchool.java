package Java_ObjectModeling;

import java.util.ArrayList;
class Course {
    String courseName;
    ArrayList<Student> enrolledStudents = new ArrayList<>();
    Course(String n) { courseName = n; }

    void enrollStudent(Student s) {
        enrolledStudents.add(s);
    }
}
class Student {
    String name;
    ArrayList<Course> courses = new ArrayList<>();
    Student(String n) { name = n; }

    void enroll(Course c) {
        courses.add(c);
        c.enrollStudent(this);
    }

    void viewCourses() {
        for (Course c : courses) {
            System.out.println(name + " enrolled in " + c.courseName);
        }
    }
}
class School {
    String schoolName;
    ArrayList<Student> students = new ArrayList<>();
    School(String s) { schoolName = s; }

    void addStudent(Student st) {
        students.add(st);
    }
}
public class TestSchool {
    public static void main(String[] args) {
        School sch = new School("Greenwood High");
        Student s1 = new Student("Ravi");
        Course c1 = new Course("Math");
        Course c2 = new Course("Science");

        sch.addStudent(s1);
        s1.enroll(c1);
        s1.enroll(c2);
        s1.viewCourses();
    }
}
