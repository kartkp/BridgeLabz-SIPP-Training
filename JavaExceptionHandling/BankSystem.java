package JavaExceptionHandling;

import java.util.*;

class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String msg) {
        super(msg);
    }
}

class BankAccount {
    double balance;

    BankAccount(double balance) {
        this.balance = balance;
    }

    void withdraw(double amount) throws InsufficientBalanceException {
        if (amount < 0) {
            throw new IllegalArgumentException("Invalid amount!");
        } else if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient balance!");
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful, new balance: " + balance);
        }
    }
}

public class BankSystem {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(5000);
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter amount to withdraw: ");
        double amt = sc.nextDouble();

        try {
            account.withdraw(amt);
        } catch (IllegalArgumentException | InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }
    }
}
