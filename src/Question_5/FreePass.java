package Question_5;

// FreePass.java
public class FreePass extends Fare {

    public FreePass(String origin, String destination) {
        super(origin, destination, 0); // Fare amount is set to zero
    }

    @Override
    public double calculateFare() {
        return 0; // No fare
    }
}
