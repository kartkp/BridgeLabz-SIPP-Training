import java.util.*;

abstract class BankAccount {
    private String accountNumber;
    private String holderName;
    private double balance;

    public BankAccount(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    public String getAccountNumber() { return accountNumber; }
    public String getHolderName() { return holderName; }
    public double getBalance() { return balance; }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }

    public abstract double calculateInterest();
}

interface Loanable {
    void applyForLoan(double amount);
    double calculateLoanEligibility();
}

class SavingsAccount extends BankAccount implements Loanable {
    private double loanAmount;

    public SavingsAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    public double calculateInterest() {
        return getBalance() * 0.04;
    }

    public void applyForLoan(double amount) {
        loanAmount = amount;
    }

    public double calculateLoanEligibility() {
        return getBalance() * 2;
    }
}

class CurrentAccount extends BankAccount implements Loanable {
    private double loanAmount;

    public CurrentAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    public double calculateInterest() {
        return getBalance() * 0.02;
    }

    public void applyForLoan(double amount) {
        loanAmount = amount;
    }

    public double calculateLoanEligibility() {
        return getBalance() * 1.5;
    }
}

public class BankingSystem {
    public static void main(String[] args) {
        List<BankAccount> accounts = new ArrayList<>();
        SavingsAccount sa = new SavingsAccount("SA101", "Alice", 50000);
        CurrentAccount ca = new CurrentAccount("CA202", "Bob", 100000);

        accounts.add(sa);
        accounts.add(ca);

        sa.deposit(10000);
        ca.withdraw(20000);

        sa.applyForLoan(30000);
        ca.applyForLoan(50000);

        for (BankAccount acc : accounts) {
            System.out.println("Account: " + acc.getAccountNumber() + ", Holder: " + acc.getHolderName());
            System.out.println("Balance: " + acc.getBalance());
            System.out.println("Interest: " + acc.calculateInterest());

            if (acc instanceof Loanable) {
                Loanable loan = (Loanable) acc;
                System.out.println("Loan Eligibility: " + loan.calculateLoanEligibility());
            }
            System.out.println();
        }
    }
}