package Question_5;

// PhysicallyHandicappedPass.java
public class PhysicallyHandicappedPass extends Fare {

    public PhysicallyHandicappedPass(String origin, String destination, double fareAmount) {
        super(origin, destination, fareAmount);
    }

    @Override
    public double calculateFare() {
        return fareAmount * 0.6; // 40% discount
    }
}
