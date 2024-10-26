package Question_3.Enitity;


import Question_3.Interface.IMobile;
import Question_3.Interface.ITelephone;

public class Mobile implements IMobile, ITelephone {
    protected String IEMICode;
    protected boolean isSingleSIM;
    protected String processor;
    protected String SIMCard;
    protected String mobileNo;

    // Constructor to initialize mobile properties
    public Mobile(String IEMICode, boolean isSingleSIM, String processor, String SIMCard, String mobileNo) {
        this.IEMICode = IEMICode;
        this.isSingleSIM = isSingleSIM;
        this.processor = processor;
        this.SIMCard = SIMCard;
        this.mobileNo = mobileNo;
    }

    // Implementing the dial method
    @Override
    public void dial(String number) {
        System.out.println("Dialing " + number + " from " + mobileNo);
    }

    // Other member functions
    public void connectBluetooth() {
        System.out.println("Bluetooth connected.");
    }

    public String getIEMICode() {
        return IEMICode;
    }

    public void getWIFIConnection() {
        System.out.println("Connected to WiFi.");
    }

    public void receive() {
        System.out.println("Receiving a call.");
    }

    public void sendMessage(String message) {
        System.out.println("Sending message: " + message);
    }
}

