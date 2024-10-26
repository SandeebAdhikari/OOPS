package Question_3.Enitity;

public class Samsung extends Mobile {
    public Samsung(String IEMICode, boolean isSingleSIM, String processor, String SIMCard, String mobileNo) {
        super(IEMICode, isSingleSIM, processor, SIMCard, mobileNo);
    }

    public void useSamsungPay() {
        System.out.println("Using Samsung Pay.");
    }
}

