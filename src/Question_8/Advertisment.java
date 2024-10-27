package Question_8;

// Advertisment.java
public class Advertisment {
    protected String advertismentId;
    protected String adDescription;

    // Constructor
    public Advertisment(String advertismentId, String adDescription) {
        this.advertismentId = advertismentId;
        this.adDescription = adDescription;
    }

    // Getter methods
    public String getAdvertismentId() {
        return advertismentId;
    }

    public String getAdDescription() {
        return adDescription;
    }

    // Method to display advertisement details
    public void displayAdDetails() {
        System.out.println("Advertisment ID: " + advertismentId);
        System.out.println("Ad Description: " + adDescription);
    }
}
