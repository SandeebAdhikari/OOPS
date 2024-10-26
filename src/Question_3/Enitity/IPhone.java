package Question_3.Enitity;

public class IPhone extends Mobile {
    public IPhone(String IEMICode, boolean isSingleSIM, String processor, String SIMCard, String mobileNo) {
        super(IEMICode, isSingleSIM, processor, SIMCard, mobileNo);
    }

    public void useFaceID() {
        System.out.println("Using Face ID.");
    }
}