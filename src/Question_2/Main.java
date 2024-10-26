package Question_2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Employee ID: ");
        int empId = scanner.nextInt();

        System.out.print("Enter Basic Salary: ");
        double basic = scanner.nextDouble();

        System.out.print("Enter Allowance: ");
        double allowance = scanner.nextDouble();

        System.out.print("Enter Deductions: ");
        double deductions = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Enter First Name: ");
        String firstName = scanner.nextLine();

        System.out.print("Enter Last Name: ");
        String lastName = scanner.nextLine();

        System.out.print("Enter Address: ");
        String address = scanner.nextLine();

        System.out.print("Enter Pincode: ");
        String pincode = scanner.nextLine();

        System.out.println("Select Employee Type:");
        System.out.println("1. Part-Time Employee");
        System.out.println("2. Full-Time Employee");
        System.out.println("3. Night Shift Employee");
        System.out.println("4. Manager");
        int employeeType = scanner.nextInt();

        Employee employee;
        switch (employeeType) {
            case 1:
                employee = new PartTimeEmployee(empId, basic, allowance, deductions, firstName, lastName, address, pincode);
                break;
            case 2:
                employee = new FullTimeEmployee(empId, basic, allowance, deductions, firstName, lastName, address, pincode);
                break;
            case 3:
                System.out.print("Enter Cab Allowance for Night Shift Employee: ");
                double cabAllowance = scanner.nextDouble();
                employee = new NightShiftEmployees(empId, basic, allowance, deductions, firstName, lastName, address, pincode, cabAllowance);
                break;
            case 4:
                System.out.print("Enter Cab Allowance for Manager: ");
                cabAllowance = scanner.nextDouble();
                employee = new Manager(empId, basic, allowance, deductions, firstName, lastName, address, pincode, cabAllowance);
                break;
            default:
                System.out.println("Invalid employee type.");
                scanner.close();
                return;
        }

        System.out.println("\nEmployee Details:");
        System.out.println("Employee ID: " + employee.getEmpId());
        System.out.println("Full Name: " + employee.getRealName());
        System.out.println("Address: " + employee.getAddress());
        System.out.println("Zip Code: " + employee.getPincode());
        System.out.println("Calculated Salary: $" + employee.calcSalary());

        scanner.close();
    }
}
