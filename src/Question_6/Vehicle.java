package Question_6;

// Vehicle.java
public abstract class Vehicle {
    protected String regNumber;

    // Constructor
    public Vehicle(String regNumber) {
        this.regNumber = regNumber;
    }

    // Abstract method to get the number of wheels
    public abstract int getNumberOfWheels();

    // Getter for regNumber
    public String getRegNumber() {
        return regNumber;
    }

    // Override equals method to check equality based on regNumber
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Vehicle vehicle = (Vehicle) obj;
        return regNumber.equals(vehicle.regNumber);
    }

    // Override hashCode to maintain consistency with equals
    @Override
    public int hashCode() {
        return regNumber.hashCode();
    }
}
