package Question_3.Enitity;

public class SamsungS5 extends Samsung {
    public SamsungS5(String IEMICode, boolean isSingleSIM, String processor, String SIMCard, String mobileNo) {
        super(IEMICode, isSingleSIM, processor, SIMCard, mobileNo);
    }

    public void take4KVideo() {
        System.out.println("Recording in 4K on Samsung S5.");
    }
}