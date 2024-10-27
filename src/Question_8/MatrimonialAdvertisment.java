package Question_8;

// MatrimonialAdvertisment.java
public class MatrimonialAdvertisment extends Advertisment {
    private String gender;
    private int age;
    private String occupation;

    // Constructor
    public MatrimonialAdvertisment(String advertismentId, String adDescription, String gender, int age, String occupation) {
        super(advertismentId, adDescription);
        this.gender = gender;
        this.age = age;
        this.occupation = occupation;
    }

    // Display Matrimonial Advertisement Details
    @Override
    public void displayAdDetails() {
        super.displayAdDetails();
        System.out.println("Gender: " + gender);
        System.out.println("Age: " + age);
        System.out.println("Occupation: " + occupation);
    }
}
