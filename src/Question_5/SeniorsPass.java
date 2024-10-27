package Question_5;

// SeniorsPass.java
public class SeniorsPass extends Fare {

    public SeniorsPass(String origin, String destination, double fareAmount) {
        super(origin, destination, fareAmount);
    }

    @Override
    public double calculateFare() {
        return fareAmount * 0.4; // 60% discount for seniors
    }
}
