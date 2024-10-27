package Question_7;

// NonFinancialPetition.java
public class NonFinancialPetition extends Petition {
    private String citizenName;
    private String implementationDate;

    // Constructor
    public NonFinancialPetition(String petitionId, String name, String dateRegistered, String location,
                                String city, String problemDescription, String status, String citizenName,
                                String implementationDate) {
        super(petitionId, name, dateRegistered, location, city, problemDescription, status);
        this.citizenName = citizenName;
        this.implementationDate = implementationDate;
    }

    // Getters for additional attributes
    public String getCitizenName() {
        return citizenName;
    }

    public String getImplementationDate() {
        return implementationDate;
    }

    // Display Non-Financial Petition Details
    @Override
    public void displayPetitionDetails() {
        super.displayPetitionDetails();
        System.out.println("Citizen Name: " + citizenName);
        System.out.println("Implementation Date: " + implementationDate);
    }
}
