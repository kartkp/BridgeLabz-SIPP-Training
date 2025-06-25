package Java_Constructors.Access_Modifiers;
class Employee {
    public int employeeID;
    protected String department;
    private double salary;

    public Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    public void updateSalary(double newSalary) {
        if (newSalary > 0) {
            this.salary = newSalary;
        }
    }

    public double getSalary() {
        return salary;
    }
}
class Manager extends Employee {
    public Manager(int employeeID, String department, double salary) {
        super(employeeID, department, salary);
    }

    public void showDetails() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
        System.out.println("Salary: ₹" + getSalary());
    }
    public static void main(String[] args) {
        Manager mgr = new Manager(201, "Finance", 75000);
        mgr.showDetails();
        mgr.updateSalary(82000);
        System.out.println("Updated Salary: ₹" + mgr.getSalary());
    }
}
