package Question_7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Select Petition Type:");
        System.out.println("1. Financial Petition");
        System.out.println("2. Non-Financial Petition");
        int petitionType = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        // Common attributes for all petitions
        System.out.print("Enter Petition ID: ");
        String petitionId = scanner.nextLine();

        System.out.print("Enter Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Date Registered (e.g., YYYY-MM-DD): ");
        String dateRegistered = scanner.nextLine();

        System.out.print("Enter Location: ");
        String location = scanner.nextLine();

        System.out.print("Enter City: ");
        String city = scanner.nextLine();

        System.out.print("Enter Problem Description: ");
        String problemDescription = scanner.nextLine();

        System.out.print("Enter Status: ");
        String status = scanner.nextLine();

        Petition petition = null;

        // Additional attributes based on petition type
        switch (petitionType) {
            case 1:
                System.out.print("Enter Amount Involved: ");
                double amountInvolved = scanner.nextDouble();
                petition = new FinancialPetition(petitionId, name, dateRegistered, location, city, problemDescription, status, amountInvolved);
                break;

            case 2:
                System.out.print("Enter Citizen Name: ");
                String citizenName = scanner.nextLine();

                System.out.print("Enter Implementation Date (e.g., YYYY-MM-DD): ");
                String implementationDate = scanner.nextLine();

                petition = new NonFinancialPetition(petitionId, name, dateRegistered, location, city, problemDescription, status, citizenName, implementationDate);
                break;

            default:
                System.out.println("Invalid petition type selected.");
                scanner.close();
                return;
        }

        // Display the petition details
        System.out.println("\nPetition Details:");
        petition.displayPetitionDetails();

        scanner.close();
    }
}
