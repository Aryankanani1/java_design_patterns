package design_pattern.structural_pattern.adapter_pattern;

public class Adapter implements UsbChrager {

        private final OldCharger oldCharger;

    public Adapter(OldCharger oldCharger){
        this.oldCharger = oldCharger;

    }

    @Override
            public void chargeWithUSB() {
        System.out.println("you can charge adapter is placed");
        oldCharger.chargeWithRoundPin();
    }

}
