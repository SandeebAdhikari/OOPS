package Question_3;

import Question_3.Enitity.NokiaLumia625;
import Question_3.Enitity.SamsungS5;

public class Main {
    public static void main(String[] args) {
        SamsungS5 samsungS5 = new SamsungS5("1234567890", true, "Exynos", "Nano SIM", "555-1234");
        samsungS5.dial("555-6789");
        samsungS5.connectBluetooth();
        samsungS5.getWIFIConnection();
        samsungS5.sendMessage("Hello from Samsung S5!");
        samsungS5.take4KVideo();

        NokiaLumia625 nokiaLumia625 = new NokiaLumia625("0987654321", false, "Snapdragon", "Micro SIM", "555-4321");
        nokiaLumia625.dial("555-9876");
        nokiaLumia625.usePureViewCamera();
        nokiaLumia625.getWIFIConnection();
        nokiaLumia625.receive();
    }
}
