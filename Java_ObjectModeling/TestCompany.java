package Java_ObjectModeling;

import java.util.ArrayList;

class Employee {
    String name;
    Employee(String n) { name = n; }
}

class Department {
    String deptName;
    ArrayList<Employee> employees = new ArrayList<>();
    Department(String d) { deptName = d; }

    void addEmployee(Employee e) {
        employees.add(e);
    }
}

class Company {
    String companyName;
    ArrayList<Department> departments = new ArrayList<>();
    Company(String c) { companyName = c; }

    void addDepartment(Department d) {
        departments.add(d);
    }
}

public class TestCompany {
    public static void main(String[] args) {
        Company comp = new Company("TechSoft");

        Department d1 = new Department("HR");
        Department d2 = new Department("IT");

        d1.addEmployee(new Employee("Alice"));
        d2.addEmployee(new Employee("Bob"));

        comp.addDepartment(d1);
        comp.addDepartment(d2);
    }
}

