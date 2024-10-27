package Question_5;

// Fare.java
public class Fare {
    protected String origin;
    protected String destination;
    protected double fareAmount;

    // Constructor
    public Fare(String origin, String destination, double fareAmount) {
        this.origin = origin;
        this.destination = destination;
        this.fareAmount = fareAmount;
    }

    // Method to calculate fare (no discount in base class)
    public double calculateFare() {
        return fareAmount;
    }

    // Method to print fare
    public void printFare() {
        System.out.println("Fare from " + origin + " to " + destination + " is: $" + calculateFare());
    }
}

