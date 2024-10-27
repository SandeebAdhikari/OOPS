package Question_6;

public class FourWheeler extends Vehicle {

    // Constructor
    public FourWheeler(String regNumber) {
        super(regNumber);
    }

    // Override the getNumberOfWheels method to return 4
    @Override
    public int getNumberOfWheels() {
        return 4;
    }
}

