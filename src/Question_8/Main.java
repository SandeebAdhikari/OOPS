package Question_8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Select Advertisement Type:");
        System.out.println("1. Matrimonial Advertisement");
        System.out.println("2. Real Estate Advertisement");
        int adType = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        // Common attributes for all advertisements
        System.out.print("Enter Advertisement ID: ");
        String advertismentId = scanner.nextLine();

        System.out.print("Enter Advertisement Description: ");
        String adDescription = scanner.nextLine();

        Advertisment advertisment = null;

        // Additional attributes based on advertisement type
        switch (adType) {
            case 1:
                System.out.print("Enter Gender: ");
                String gender = scanner.nextLine();

                System.out.print("Enter Age: ");
                int age = scanner.nextInt();
                scanner.nextLine(); // Consume newline

                System.out.print("Enter Occupation: ");
                String occupation = scanner.nextLine();

                advertisment = new MatrimonialAdvertisment(advertismentId, adDescription, gender, age, occupation);
                break;

            case 2:
                System.out.print("Enter Real Estate Type: ");
                String realEstateType = scanner.nextLine();

                System.out.print("Enter Size (in sq ft): ");
                double size = scanner.nextDouble();

                System.out.print("Enter Price: ");
                double price = scanner.nextDouble();

                advertisment = new RealEstateAdvertisment(advertismentId, adDescription, realEstateType, size, price);
                break;

            default:
                System.out.println("Invalid advertisement type selected.");
                scanner.close();
                return;
        }

        // Display the advertisement details
        System.out.println("\nAdvertisement Details:");
        advertisment.displayAdDetails();

        scanner.close();
    }
}

