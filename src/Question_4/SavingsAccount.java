package Question_4;

// SavingsAccount.java
public class SavingsAccount extends Account {
    private double interestRate;

    // Constructor to initialize SavingsAccount details
    public SavingsAccount(String accNo, String name, String mobileNumber, double balance, double interestRate) {
        super(accNo, name, mobileNumber, balance);
        this.interestRate = interestRate;
    }

    // Method to add interest to the balance
    public void addInterest() {
        double interest = balance * (interestRate / 100);
        balance += interest;
        System.out.println("Interest added: $" + interest);
    }
}
