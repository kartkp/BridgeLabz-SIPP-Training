package Java_ObjectModeling;

// import java.util.ArrayList;
class Professor {
    String name;
    Professor(String n) { name = n; }

    void assignCourse(CourseUMS c) {
        System.out.println(name + " is assigned to " + c.name);
    }
}

class StudentUMS {
    String name;
    StudentUMS(String n) { name = n; }

    void enrollCourse(CourseUMS c) {
        System.out.println(name + " enrolled in " + c.name);
    }
}
class CourseUMS {
    String name;
    CourseUMS(String n) { name = n; }
}
public class TestUniversitySystem {
    public static void main(String[] args) {
        StudentUMS s = new StudentUMS("Neha");
        Professor p = new Professor("Dr. Sen");
        CourseUMS c = new CourseUMS("Data Structures");

        s.enrollCourse(c);
        p.assignCourse(c);
    }
}
