package Java_Constructors.Access_Modifiers;

class BankAccount {
    public String accountNumber;
    protected String accountHolder;
    private double balance;

    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public void deposit(double amt) {
        if (amt > 0) balance += amt;
    }

    public void withdraw(double amt) {
        if (amt <= balance) balance -= amt;
    }

    public double getBalance() {
        return balance;
    }
}
class SavingsAccount extends BankAccount {
    public SavingsAccount(String accNo, String holder, double balance) {
        super(accNo, holder, balance);
    }

    public void showDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: ₹" + getBalance());
    }
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount("SAV001", "Karan Patel", 5000);
        sa.showDetails();
        sa.deposit(1000);
        sa.withdraw(2000);
        System.out.println("Updated Balance: ₹" + sa.getBalance());
    }
}

