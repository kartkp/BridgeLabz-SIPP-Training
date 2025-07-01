package Java_Inheritance;

class Person {
    String name;
    int age;
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Teacher extends Person {
    String subject;
    Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }
    void displayRole() {
        System.out.println("Teacher " + name + " " + age + " " + subject);
    }
}

class Student extends Person {
    String grade;
    Student(String name, int age, String grade) {
        super(name, age);
        this.grade = grade;
    }
    void displayRole() {
        System.out.println("Student " + name + " " + age + " " + grade);
    }
}

class Staff extends Person {
    String department;
    Staff(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }
    void displayRole() {
        System.out.println("Staff " + name + " " + age + " " + department);
    }
}

public class SchoolSystem {
    public static void main(String[] args) {
        Teacher t = new Teacher("Alice", 30, "Math");
        Student s = new Student("Bob", 15, "10th");
        Staff st = new Staff("Charlie", 40, "Admin");
        t.displayRole();
        s.displayRole();
        st.displayRole();
    }
}

