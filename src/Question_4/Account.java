package Question_4;

// Account.java
public class Account {
    protected String accNo;
    protected String name;
    protected String mobileNumber;
    protected double balance;

    // Constructor to initialize account details
    public Account(String accNo, String name, String mobileNumber, double balance) {
        this.accNo = accNo;
        this.name = name;
        this.mobileNumber = mobileNumber;
        this.balance = balance;
    }

    // Deposit money into the account
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Deposit amount should be positive.");
        }
    }

    // Withdraw money from the account
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: $" + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    // Get the current balance
    public double getBalance() {
        return balance;
    }
}

