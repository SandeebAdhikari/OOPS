package Question_4;

// CheckingAccount.java
public class CheckingAccount extends Account {
    private int noOfFreeTransactions;
    private int transactionCount = 0;
    private double transactionFee;

    // Constructor to initialize CheckingAccount details
    public CheckingAccount(String accNo, String name, String mobileNumber, double balance, int noOfFreeTransactions, double transactionFee) {
        super(accNo, name, mobileNumber, balance);
        this.noOfFreeTransactions = noOfFreeTransactions;
        this.transactionFee = transactionFee;
    }

    // Override deposit to count as a transaction
    @Override
    public void deposit(double amount) {
        super.deposit(amount);
        applyTransactionFee();
    }

    // Override withdraw to count as a transaction
    @Override
    public void withdraw(double amount) {
        super.withdraw(amount);
        applyTransactionFee();
    }

    // Method to apply transaction fee if free transactions are exceeded
    private void applyTransactionFee() {
        transactionCount++;
        if (transactionCount > noOfFreeTransactions) {
            balance -= transactionFee;
            System.out.println("Transaction fee of $" + transactionFee + " applied.");
        }
    }
}
