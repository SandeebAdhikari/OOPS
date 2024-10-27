package Question_5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Origin: ");
        String origin = scanner.nextLine();

        System.out.print("Enter Destination: ");
        String destination = scanner.nextLine();

        System.out.print("Enter Fare Amount: ");
        double fareAmount = scanner.nextDouble();

        System.out.println("Select Pass Type:");
        System.out.println("1. One-Time Pass");
        System.out.println("2. Seasonal Pass");
        System.out.println("3. Student Seasonal Pass");
        System.out.println("4. Free Pass");
        System.out.println("5. Child Pass");
        System.out.println("6. Adult Pass");
        System.out.println("7. Physically Handicapped Pass");
        System.out.println("8. Seniors Pass");

        int passType = scanner.nextInt();

        Fare fare = null;

        // Create the appropriate pass type based on user input
        switch (passType) {
            case 1:
                fare = new OneTime(origin, destination, fareAmount);
                break;
            case 2:
                fare = new SeasonalPass(origin, destination, fareAmount);
                break;
            case 3:
                fare = new StudentSeasonalPass(origin, destination, fareAmount);
                break;
            case 4:
                fare = new FreePass(origin, destination);
                break;
            case 5:
                fare = new ChildPass(origin, destination, fareAmount);
                break;
            case 6:
                fare = new AdultPass(origin, destination, fareAmount);
                break;
            case 7:
                fare = new PhysicallyHandicappedPass(origin, destination, fareAmount);
                break;
            case 8:
                fare = new SeniorsPass(origin, destination, fareAmount);
                break;
            default:
                System.out.println("Invalid pass type selected.");
                scanner.close();
                return;
        }

        // Calculate and display the fare
        fare.printFare();

        scanner.close();
    }
}

