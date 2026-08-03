package design_pattern.structural_pattern.adapter_pattern;

public class Phone {
   private final UsbChrager usbChrager;

    public Phone(UsbChrager usbChrager) {
        this.usbChrager = usbChrager;
    }


    public void chargePhone(){
        usbChrager.chargeWithUSB();
    }
}
