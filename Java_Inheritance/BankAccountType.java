package Java_Inheritance;

class BankAccount {
    String accountNumber;
    double balance;
    BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
}

class SavingsAccount extends BankAccount {
    double interestRate;
    SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }
    void displayAccountType() {
        System.out.println("Savings Account " + accountNumber + " " + balance + " " + interestRate);
    }
}

class CheckingAccount extends BankAccount {
    double withdrawalLimit;
    CheckingAccount(String accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }
    void displayAccountType() {
        System.out.println("Checking Account " + accountNumber + " " + balance + " " + withdrawalLimit);
    }
}

class FixedDepositAccount extends BankAccount {
    String maturityDate;
    FixedDepositAccount(String accountNumber, double balance, String maturityDate) {
        super(accountNumber, balance);
        this.maturityDate = maturityDate;
    }
    void displayAccountType() {
        System.out.println("Fixed Deposit Account " + accountNumber + " " + balance + " " + maturityDate);
    }
}

public class BankAccountType {
    public static void main(String[] args) {
        SavingsAccount s = new SavingsAccount("SA123", 5000, 4.5);
        CheckingAccount c = new CheckingAccount("CA456", 3000, 1000);
        FixedDepositAccount f = new FixedDepositAccount("FD789", 10000, "31-12-2025");
        s.displayAccountType();
        c.displayAccountType();
        f.displayAccountType();
    }
}

