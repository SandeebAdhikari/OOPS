package Question_8;

// RealEstateAdvertisment.java
public class RealEstateAdvertisment extends Advertisment {
    private String realEstateType;
    private double size;
    private double price;

    // Constructor
    public RealEstateAdvertisment(String advertismentId, String adDescription, String realEstateType, double size, double price) {
        super(advertismentId, adDescription);
        this.realEstateType = realEstateType;
        this.size = size;
        this.price = price;
    }

    // Display Real Estate Advertisement Details
    @Override
    public void displayAdDetails() {
        super.displayAdDetails();
        System.out.println("Real Estate Type: " + realEstateType);
        System.out.println("Size: " + size + " sq ft");
        System.out.println("Price: $" + price);
    }
}
