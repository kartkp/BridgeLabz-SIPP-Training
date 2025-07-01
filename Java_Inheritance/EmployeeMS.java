package Java_Inheritance;

class Employee {
    String name;
    int id;
    double salary;
    Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    void displayDetails() {
        System.out.println(name + " " + id + " " + salary);
    }
}

class Manager extends Employee {
    int teamSize;
    Manager(String name, int id, double salary, int teamSize) {
        super(name, id, salary);
        this.teamSize = teamSize;
    }
    void displayDetails() {
        super.displayDetails();
        System.out.println(teamSize);
    }
}

class Developer extends Employee {
    String programmingLanguage;
    Developer(String name, int id, double salary, String programmingLanguage) {
        super(name, id, salary);
        this.programmingLanguage = programmingLanguage;
    }
    void displayDetails() {
        super.displayDetails();
        System.out.println(programmingLanguage);
    }
}

class Intern extends Employee {
    String school;
    Intern(String name, int id, double salary, String school) {
        super(name, id, salary);
        this.school = school;
    }
    void displayDetails() {
        super.displayDetails();
        System.out.println(school);
    }
}

public class EmployeeMS {
    public static void main(String[] args) {
        Manager m = new Manager("Alice", 1, 50000, 5);
        Developer d = new Developer("Bob", 2, 40000, "Java");
        Intern i = new Intern("Charlie", 3, 10000, "ABC University");
        m.displayDetails();
        d.displayDetails();
        i.displayDetails();
    }
}

