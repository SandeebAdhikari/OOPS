package Question_3.Enitity;

public class Nokia extends Mobile {
    public Nokia(String IEMICode, boolean isSingleSIM, String processor, String SIMCard, String mobileNo) {
        super(IEMICode, isSingleSIM, processor, SIMCard, mobileNo);
    }

    public void useNokiaMaps() {
        System.out.println("Using Nokia Maps.");
    }
}