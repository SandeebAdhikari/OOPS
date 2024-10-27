package Question_5;

// ChildPass.java
public class ChildPass extends Fare {

    public ChildPass(String origin, String destination, double fareAmount) {
        super(origin, destination, fareAmount);
    }

    @Override
    public double calculateFare() {
        return fareAmount * 0.5; // 50% discount for children
    }
}

