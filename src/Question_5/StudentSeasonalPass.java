package Question_5;

// StudentSeasonalPass.java
public class StudentSeasonalPass extends SeasonalPass {

    public StudentSeasonalPass(String origin, String destination, double fareAmount) {
        super(origin, destination, fareAmount);
    }

    @Override
    public double calculateFare() {
        return fareAmount * 0.7; // 30% discount
    }
}
