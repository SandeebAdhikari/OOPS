package Question_5;

// AdultPass.java
public class AdultPass extends Fare {

    public AdultPass(String origin, String destination, double fareAmount) {
        super(origin, destination, fareAmount);
    }

    @Override
    public double calculateFare() {
        return fareAmount; // No discount for adults
    }
}

