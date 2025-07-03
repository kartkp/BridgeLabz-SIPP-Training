public abstract class Employee {
    private int employeeId;
    private String name;
    private double baseSalary;

    public Employee(int employeeId, String name, double baseSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public int getEmployeeId() { return employeeId; }
    public String getName() { return name; }
    public double getBaseSalary() { return baseSalary; }
    public void setBaseSalary(double baseSalary) { this.baseSalary = baseSalary; }

    public abstract double calculateSalary();

    public void displayDetails() {
        System.out.println("ID: " + employeeId + ", Name: " + name + ", Base Salary: " + baseSalary);
    }
}

public interface Department {
    void assignDepartment(String deptName);
    String getDepartmentDetails();
}

public class FullTimeEmployee extends Employee implements Department {
    private String department;

    public FullTimeEmployee(int employeeId, String name, double baseSalary) {
        super(employeeId, name, baseSalary);
    }

    public double calculateSalary() {
        return getBaseSalary();
    }

    public void assignDepartment(String deptName) { department = deptName; }
    public String getDepartmentDetails() { return department; }
}

public class PartTimeEmployee extends Employee implements Department {
    private String department;
    private int hoursWorked;
    private double hourlyRate;

    public PartTimeEmployee(int employeeId, String name, double hourlyRate, int hoursWorked) {
        super(employeeId, name, 0);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }

    public void assignDepartment(String deptName) { department = deptName; }
    public String getDepartmentDetails() { return department; }
}

import java.util.*;
public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        FullTimeEmployee e1 = new FullTimeEmployee(1, "Alice", 50000);
        PartTimeEmployee e2 = new PartTimeEmployee(2, "Bob", 200, 30);
        e1.assignDepartment("IT");
        e2.assignDepartment("Support");

        employees.add(e1);
        employees.add(e2);

        for (Employee e : employees) {
            e.displayDetails();
            System.out.println("Salary: " + e.calculateSalary());
            if (e instanceof Department) {
                System.out.println("Department: " + ((Department) e).getDepartmentDetails());
            }
            System.out.println();
        }
    }
}    
