package Java_ObjectModeling;

import java.util.ArrayList;

class Faculty {
    String name;
    Faculty(String n) { name = n; }
}

class DepartmentU {
    String deptName;
    DepartmentU(String d) { deptName = d; }
}

class University {
    String uniName;
    ArrayList<DepartmentU> departments = new ArrayList<>();
    ArrayList<Faculty> faculties = new ArrayList<>();
    University(String n) { uniName = n; }

    void addDepartment(DepartmentU d) {
        departments.add(d);
    }

    void addFaculty(Faculty f) {
        faculties.add(f);
    }
}
public class TestUniversity {
    public static void main(String[] args) {
        University u = new University("MIT");
        DepartmentU d1 = new DepartmentU("Computer Science");
        Faculty f1 = new Faculty("Dr. Kumar");
        u.addDepartment(d1);
        u.addFaculty(f1);
    }
}

