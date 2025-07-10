
// University Course enrollment System
// Scenario: Student should be able to enroll in courses, and faculty can assign grades.
// concept used:
// class : student, courses, faculty enrollment
// constructors: used to create students with without elective preferences
// access modifier private for internal gpa fields, public method to access
// transcript
// interface : graded with method assignGrade()
// operators: gpa calculation and comparison(using +,/, etc)

// oops: 
// encapsulation: secure handling of grades
// inheritance: undergraduate, postgraduate extend student
import java.util.*;

interface Graded {
    void assignGrade(String course, int grade);
}

public class UniversityEnrollment implements Graded {
    private String name;
    private String major;
   		private double gpa;
    private List<String> courses;
    private List<String> gradeCourses;
    private List<Integer> gradeValues;

    public UniversityEnrollment(String name, String major) {
        this.name = name;
        this.major = major;
        this.courses = new ArrayList<>();
        this.gradeCourses = new ArrayList<>();
        this.gradeValues = new ArrayList<>();
    }
    public void enroll(String course) {
        courses.add(course);
        System.out.println(name + " enrolled in " + course);
    }
    public void assignGrade(String course, int grade) {
        if (!courses.contains(course)) {
            System.out.println("Cannot assign grade, " + name + " not got in " + course);
            return;
        }
        int idx = gradeCourses.indexOf(course);
        if (idx != -1) {
            gradeValues.set(idx, grade);
        } else {
            gradeCourses.add(course);
            gradeValues.add(grade);
        }
        calGPA();
        System.out.println("Grade " + grade + " got in " + course + " to " + name);
    }
    private void calGPA() {
        if (gradeValues.size() == 0) {
            gpa = 0;
            return;
        }
        double total = 0;
        for (int g : gradeValues) {
            total += g;
        }
        gpa = total / gradeValues.size();
    }

    public void printtranscript() {
        System.out.println("\nTranscript for " + name + ":");
        for (String c : courses) {
            int idx = gradeCourses.indexOf(c);
            int gr = (idx != -1) ? gradeValues.get(idx) : 0;
            System.out.println(c + ": " + gr);
        }
        System.out.println("Current GPA: " + gpa);
    }
}

class Undergraduate extends UniversityEnrollment {
    public Undergraduate(String name, String major) {
        super(name, major);
    }
}

class Postgraduate extends UniversityEnrollment {
    public Postgraduate(String name, String major) {
        super(name, major);
    }
}

class UniversitySystem {
    public static void main(String[] args) {
        Undergraduate s1 = new Undergraduate("Aman", "CS");
        Postgraduate s2 = new Postgraduate("Babita", "AI Research");

        s1.enroll("Data Structure");
        s1.enroll("Machine Learnng");

        s2.enroll("Data Structure");

        s1.assignGrade("Data Structure", 85);
        s1.assignGrade("Machine Learnng", 71);
        s2.assignGrade("Data Structure", 88);

        s1.printtranscript();
        s2.printtranscript();
    }
}


// The above code implements a simple university enrollment system with students, courses, and faculty.
// Students can enroll in courses, and faculty can assign grades. The GPA is calculated based on the grades assigned to the courses.
// The system supports both undergraduate and postgraduate students, demonstrating inheritance. 
// The code uses encapsulation to secure the handling of grades and GPA calculations, ensuring that these details are managed internally within the Student class.
// The main method creates instances of students, courses, and faculty, demonstrating the functionality of the system.  
// The code is structured to allow for easy expansion, such as adding more courses, students, or faculty members in the future.

