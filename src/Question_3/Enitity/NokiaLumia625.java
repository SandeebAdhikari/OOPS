package Question_3.Enitity;

public class NokiaLumia625 extends Nokia {
    public NokiaLumia625(String IEMICode, boolean isSingleSIM, String processor, String SIMCard, String mobileNo) {
        super(IEMICode, isSingleSIM, processor, SIMCard, mobileNo);
    }

    public void usePureViewCamera() {
        System.out.println("Using PureView Camera on Nokia Lumia 625.");
    }
}
