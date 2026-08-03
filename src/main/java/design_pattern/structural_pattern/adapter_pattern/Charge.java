package design_pattern.structural_pattern.adapter_pattern;

public class Charge {
    public static void main(String[] args) {
        OldCharger oldCharger = new OldCharger();
        UsbChrager adapter = new Adapter(oldCharger);
        Phone phone  = new Phone(adapter);
        phone.chargePhone();

    }
}
