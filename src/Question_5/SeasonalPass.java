package Question_5;

// SeasonalPass.java
public class SeasonalPass extends Fare {

    public SeasonalPass(String origin, String destination, double fareAmount) {
        super(origin, destination, fareAmount);
    }

    @Override
    public double calculateFare() {
        return fareAmount * 0.9; // 10% discount
    }
}

