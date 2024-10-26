package Question_2;

// Employee.java
public class Employee {
    private int empId;
    private double basic;
    private double allowance;
    private double deductions;
    private double sal; // Read-only salary
    private String firstName;
    private String lastName;
    private String address;
    private String pincode;

    // Parameterized constructor to initialize employee details
    public Employee(int empId, double basic, double allowance, double deductions,
                    String firstName, String lastName, String address, String pincode) {
        this.empId = empId;
        this.basic = basic;
        this.allowance = allowance;
        this.deductions = deductions;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.pincode = pincode;
        this.sal = calcSalary(); // Calculate initial salary
    }

    // Getter for EmpId
    public int getEmpId() {
        return empId;
    }

    // Getter and Setter for Basic, Allowance, and Deductions
    public double getBasic() {
        return basic;
    }

    public void setBasic(double basic) {
        this.basic = basic;
    }

    public double getAllowance() {
        return allowance;
    }

    public void setAllowance(double allowance) {
        this.allowance = allowance;
    }

    public double getDeductions() {
        return deductions;
    }

    public void setDeductions(double deductions) {
        this.deductions = deductions;
    }

    // Getter for Salary (read-only)
    public double getSal() {
        return sal;
    }

    // Getter and Setter for RealName (firstName + lastName)
    public String getRealName() {
        return firstName + " " + lastName;
    }

    public void setRealName(String firstName, String lastName) {
        if (firstName.length() > 0 && lastName.length() > 0) {
            this.firstName = firstName;
            this.lastName = lastName;
        } else {
            throw new IllegalArgumentException("Real name should not be less than 1 character.");
        }
    }

    // Getter for Address
    public String getAddress() {
        return address;
    }

    // Getter for Pincode
    public String getPincode() {
        return pincode;
    }

    // Method to calculate salary
    public double calcSalary() {
        this.sal = basic + allowance - deductions;
        return this.sal;
    }
}







