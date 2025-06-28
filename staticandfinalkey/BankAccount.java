package staticandfinalkey;

class BankAccount {
    static String bankName = "SBI";
    static int totalAccounts = 0;
    final int accountNumber;
    String accountHolderName;

    BankAccount(String accountHolderName, int accountNumber) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        totalAccounts++;
    }

    static void getTotalAccounts() {
        System.out.println("Total Accounts: " + totalAccounts);
    }

    void displayDetails() {
        if (this instanceof BankAccount) {
            System.out.println("Bank: " + bankName + ", Name: " + accountHolderName + ", Acc No: " + accountNumber);
        }
    }

    public static void main(String[] args) {
        BankAccount a1 = new BankAccount("Amit", 101);
        BankAccount a2 = new BankAccount("Sara", 102);
        a1.displayDetails();
        a2.displayDetails();
        BankAccount.getTotalAccounts();
    }
}
