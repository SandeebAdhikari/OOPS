package Question_2;

// PartTimeEmployee.java
public class PartTimeEmployee extends Employee {
    public PartTimeEmployee(int empId, double basic, double allowance, double deductions,
                            String firstName, String lastName, String address, String pincode) {
        super(empId, basic, allowance, deductions, firstName, lastName, address, pincode);
    }

    // Override CalcSalary with different logic for part-time employees
    @Override
    public double calcSalary() {
        // Calculate salary as half of the full-time base salary
        return (getBasic() + getAllowance() - getDeductions()) / 2;
    }
}
