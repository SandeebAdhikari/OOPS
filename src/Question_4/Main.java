package Question_4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Select Account Type:");
        System.out.println("1. Savings Account");
        System.out.println("2. Current Account");
        System.out.println("3. Checking Account");
        int accountType = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        // Input common account details
        System.out.print("Enter Account Number: ");
        String accNo = scanner.nextLine();

        System.out.print("Enter Account Holder's Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Mobile Number: ");
        String mobileNumber = scanner.nextLine();

        System.out.print("Enter Initial Balance: ");
        double balance = scanner.nextDouble();

        Account account = null;

        // Create account based on the user's choice
        switch (accountType) {
            case 1:
                System.out.print("Enter Interest Rate for Savings Account: ");
                double savingsInterestRate = scanner.nextDouble();
                account = new SavingsAccount(accNo, name, mobileNumber, balance, savingsInterestRate);
                break;
            case 2:
                System.out.print("Enter Interest Rate for Current Account: ");
                double currentInterestRate = scanner.nextDouble();
                account = new CurrentAccount(accNo, name, mobileNumber, balance, currentInterestRate);
                break;
            case 3:
                System.out.print("Enter Number of Free Transactions for Checking Account: ");
                int noOfFreeTransactions = scanner.nextInt();
                System.out.print("Enter Transaction Fee after Free Transactions: ");
                double transactionFee = scanner.nextDouble();
                account = new CheckingAccount(accNo, name, mobileNumber, balance, noOfFreeTransactions, transactionFee);
                break;
            default:
                System.out.println("Invalid account type selected.");
                scanner.close();
                return;
        }

        boolean running = true;
        while (running) {
            // Display menu for account operations
            System.out.println("\nChoose an action:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            if (account instanceof SavingsAccount || account instanceof CurrentAccount) {
                System.out.println("4. Add Interest");
            }
            System.out.println("5. Exit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;
                case 3:
                    System.out.println("Current Balance: $" + account.getBalance());
                    break;
                case 4:
                    if (account instanceof SavingsAccount) {
                        ((SavingsAccount) account).addInterest();
                    } else if (account instanceof CurrentAccount) {
                        ((CurrentAccount) account).addInterest();
                    } else {
                        System.out.println("Invalid option for this account type.");
                    }
                    break;
                case 5:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
        System.out.println("Thank you for using the account management system!");
    }
}
