package Question_6;

// TwoWheeler.java
public class TwoWheeler extends Vehicle {

    // Constructor
    public TwoWheeler(String regNumber) {
        super(regNumber);
    }

    // Override the getNumberOfWheels method to return 2
    @Override
    public int getNumberOfWheels() {
        return 2;
    }
}
