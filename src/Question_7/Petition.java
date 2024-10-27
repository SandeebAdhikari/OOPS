package Question_7;

// Petition.java
public class Petition {
    protected String petitionId;
    protected String name;
    protected String dateRegistered;
    protected String location;
    protected String city;
    protected String problemDescription;
    protected String status;

    // Constructor
    public Petition(String petitionId, String name, String dateRegistered, String location,
                    String city, String problemDescription, String status) {
        this.petitionId = petitionId;
        this.name = name;
        this.dateRegistered = dateRegistered;
        this.location = location;
        this.city = city;
        this.problemDescription = problemDescription;
        this.status = status;
    }

    // Getter methods
    public String getPetitionId() {
        return petitionId;
    }

    public String getName() {
        return name;
    }

    public String getDateRegistered() {
        return dateRegistered;
    }

    public String getLocation() {
        return location;
    }

    public String getCity() {
        return city;
    }

    public String getProblemDescription() {
        return problemDescription;
    }

    public String getStatus() {
        return status;
    }

    // Display Petition Details
    public void displayPetitionDetails() {
        System.out.println("Petition ID: " + petitionId);
        System.out.println("Name: " + name);
        System.out.println("Date Registered: " + dateRegistered);
        System.out.println("Location: " + location);
        System.out.println("City: " + city);
        System.out.println("Problem Description: " + problemDescription);
        System.out.println("Status: " + status);
    }
}
