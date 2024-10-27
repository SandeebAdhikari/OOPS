package Question_7;

// FinancialPetition.java
public class FinancialPetition extends Petition {
    private double amountInvolved;

    // Constructor
    public FinancialPetition(String petitionId, String name, String dateRegistered, String location,
                             String city, String problemDescription, String status, double amountInvolved) {
        super(petitionId, name, dateRegistered, location, city, problemDescription, status);
        this.amountInvolved = amountInvolved;
    }

    // Getter for amountInvolved
    public double getAmountInvolved() {
        return amountInvolved;
    }

    // Display Financial Petition Details
    @Override
    public void displayPetitionDetails() {
        super.displayPetitionDetails();
        System.out.println("Amount Involved: $" + amountInvolved);
    }
}
