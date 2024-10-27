package Question_3;

import Question_3.Enitity.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Select Mobile Brand:");
        System.out.println("1. Samsung");
        System.out.println("2. Nokia");
        System.out.println("3. IPhone");
        int brandChoice = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        // Input common mobile details
        System.out.print("Enter IEMI Code: ");
        String IEMICode = scanner.nextLine();

        System.out.print("Is it a Single SIM device? (true/false): ");
        boolean isSingleSIM = scanner.nextBoolean();
        scanner.nextLine(); // Consume newline

        System.out.print("Enter Processor: ");
        String processor = scanner.nextLine();

        System.out.print("Enter SIM Card Type (e.g., Nano, Micro): ");
        String SIMCard = scanner.nextLine();

        System.out.print("Enter Mobile Number: ");
        String mobileNo = scanner.nextLine();

        Mobile mobile = null;

        // Create mobile based on the user's choice
        switch (brandChoice) {
            case 1:
                System.out.println("You have selected Samsung.");
                System.out.println("Enter Model (e.g., Samsung S5): ");
                String samsungModel = scanner.nextLine();
                if (samsungModel.equalsIgnoreCase("Samsung S5")) {
                    mobile = new SamsungS5(IEMICode, isSingleSIM, processor, SIMCard, mobileNo);
                } else {
                    mobile = new Samsung(IEMICode, isSingleSIM, processor, SIMCard, mobileNo);
                }
                break;
            case 2:
                System.out.println("You have selected Nokia.");
                System.out.println("Enter Model (e.g., Nokia Lumia 625): ");
                String nokiaModel = scanner.nextLine();
                if (nokiaModel.equalsIgnoreCase("Nokia Lumia 625")) {
                    mobile = new NokiaLumia625(IEMICode, isSingleSIM, processor, SIMCard, mobileNo);
                } else {
                    mobile = new Nokia(IEMICode, isSingleSIM, processor, SIMCard, mobileNo);
                }
                break;
            case 3:
                System.out.println("You have selected IPhone.");
                mobile = new IPhone(IEMICode, isSingleSIM, processor, SIMCard, mobileNo);
                break;
            default:
                System.out.println("Invalid choice.");
                scanner.close();
                return;
        }

        boolean running = true;
        while (running) {
            // Display menu for mobile operations
            System.out.println("\nChoose an action:");
            System.out.println("1. Dial a number");
            System.out.println("2. Connect to Bluetooth");
            System.out.println("3. Get WiFi Connection");
            System.out.println("4. Send a Message");
            System.out.println("5. Get IEMI Code");
            System.out.println("6. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter number to dial: ");
                    String numberToDial = scanner.nextLine();
                    mobile.dial(numberToDial);
                    break;
                case 2:
                    mobile.connectBluetooth();
                    break;
                case 3:
                    mobile.getWIFIConnection();
                    break;
                case 4:
                    System.out.print("Enter message to send: ");
                    String message = scanner.nextLine();
                    mobile.sendMessage(message);
                    break;
                case 5:
                    System.out.println("IEMI Code: " + mobile.getIEMICode());
                    break;
                case 6:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
        System.out.println("Thank you for using the mobile device system!");
    }
}
