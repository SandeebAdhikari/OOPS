package Question_1;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Student ID: ");
        String studentId = scanner.nextLine();

        System.out.print("Enter Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Mobile No (10 digits): ");
        String mobileNo = scanner.nextLine();

        System.out.print("Enter Address: ");
        String address = scanner.nextLine();

        System.out.println("Select Course Type:");
        System.out.println("1. FastTrack");
        System.out.println("2. Corporate");
        System.out.println("3. Weekend");
        System.out.println("4. Corporate Weekend");
        int courseChoice = scanner.nextInt();

        // Initialize Student object based on course choice
        Student student;
        switch (courseChoice) {
            case 1:
                student = new FastTrackBatchStudent();
                student.setCourse("FastTrack");
                break;
            case 2:
                student = new CorporateBatchStudent();
                student.setCourse("Corporate");
                break;
            case 3:
                student = new WeekendBatchStudent();
                student.setCourse("Weekend");
                break;
            case 4:
                student = new CorporateWeekendBatchStudent();
                student.setCourse("Corporate Weekend");
                break;
            default:
                System.out.println("Invalid course type.");
                return;
        }

        student.setStudentId(studentId);
        student.setName(name);
        student.setMobileNo(mobileNo);
        student.setAddress(address);

        double fee = student.calculateFee();
        System.out.println("Calculated Fee: $" + fee);


        saveStudentToJson(student, fee);
        System.out.println("Student data saved to student.json.");
    }

    private static void saveStudentToJson(Student student, double fee) {
        String jsonContent = String.format(
                "{\n\"studentId\": \"%s\",\n\"name\": \"%s\",\n\"mobileNo\": \"%s\",\n\"address\": \"%s\",\n\"course\": \"%s\",\n\"fee\": %.2f\n}",
                student.getStudentId(), student.getName(), student.getMobileNo(), student.getAddress(), student.getCourse(), fee);

        try (FileWriter file = new FileWriter("student.json")) {
            file.write(jsonContent);
            file.flush();
        } catch (IOException e) {
            System.err.println("Error saving student data to JSON file: " + e.getMessage());
        }
    }
}
