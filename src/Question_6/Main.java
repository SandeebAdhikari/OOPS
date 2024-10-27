import Question_6.Auto;
import Question_6.Car;
import Question_6.MotorBike;
import Question_6.Vehicle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Select Vehicle Type:");
        System.out.println("1. MotorBike");
        System.out.println("2. Auto");
        System.out.println("3. Car");

        int vehicleType = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        System.out.print("Enter Registration Number: ");
        String regNumber = scanner.nextLine();

        Vehicle vehicle = null;

        // Create specific vehicle type based on user selection
        switch (vehicleType) {
            case 1:
                vehicle = new MotorBike(regNumber);
                break;
            case 2:
                vehicle = new Auto(regNumber);
                break;
            case 3:
                vehicle = new Car(regNumber);
                break;
            default:
                System.out.println("Invalid vehicle type selected.");
                scanner.close();
                return;
        }

        // Display Vehicle Details
        System.out.println("\nVehicle Details:");
        System.out.println("Registration Number: " + vehicle.getRegNumber());
        System.out.println("Number of Wheels: " + vehicle.getNumberOfWheels());

        // Create a second vehicle for equality check
        System.out.print("\nEnter another Registration Number for comparison: ");
        String regNumber2 = scanner.nextLine();
        Vehicle vehicle2 = null;

        if (vehicleType == 1) {
            vehicle2 = new MotorBike(regNumber2);
        } else if (vehicleType == 2) {
            vehicle2 = new Auto(regNumber2);
        } else if (vehicleType == 3) {
            vehicle2 = new Car(regNumber2);
        }

        // Check if the two vehicles are equal based on registration number
        if (vehicle.equals(vehicle2)) {
            System.out.println("Both vehicles are equal based on registration number.");
        } else {
            System.out.println("The two vehicles are not equal.");
        }

        scanner.close();
    }
}
