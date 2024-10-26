package Question_2;

// NightShiftEmployees.java
public class NightShiftEmployees extends FullTimeEmployee {
    private double cabAllowance;

    public NightShiftEmployees(int empId, double basic, double allowance, double deductions,
                               String firstName, String lastName, String address, String pincode, double cabAllowance) {
        super(empId, basic, allowance, deductions, firstName, lastName, address, pincode);
        this.cabAllowance = cabAllowance;
    }

    // Override CalcSalary to include additional cab allowance
    @Override
    public double calcSalary() {
        return getBasic() + getAllowance() + cabAllowance - getDeductions();
    }
}