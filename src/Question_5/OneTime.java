package Question_5;

// OneTime.java
public class OneTime extends Fare {

    public OneTime(String origin, String destination, double fareAmount) {
        super(origin, destination, fareAmount);
    }

    @Override
    public double calculateFare() {
        return fareAmount; // No discount
    }
}

