package Question_6;

public class ThreeWheeler extends Vehicle {

    // Constructor
    public ThreeWheeler(String regNumber) {
        super(regNumber);
    }

    // Override the getNumberOfWheels method to return 3
    @Override
    public int getNumberOfWheels() {
        return 3;
    }
}

