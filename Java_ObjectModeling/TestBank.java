package Java_ObjectModeling;

class Bank {
    String name;
    Bank(String n) { name = n; }

    void openAccount(Customer c) {
        System.out.println(c.name + " opened an account in " + name);
    }
}

class Customer {
    String name;
    Customer(String n) { name = n; }

    void viewBalance() {
        System.out.println(name + " is viewing balance.");
    }
}

public class TestBank {
    public static void main(String[] args) {
        Bank b = new Bank("SBI");
        Customer c = new Customer("Rahul");

        b.openAccount(c);
        c.viewBalance();
    }
}

