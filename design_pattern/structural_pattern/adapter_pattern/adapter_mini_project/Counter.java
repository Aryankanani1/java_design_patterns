package design_pattern.structural_pattern.adapter_pattern.adapter_mini_project;

public class Counter {
    public static void main(String[] args) {
        LagacyPaymentGateWay gateWay = new LagacyPaymentGateWay(); // adaptee
        PaymentService paymentService = new ExternalGateWayAdapter(gateWay); // adapter
        CheckOut checkOut = new CheckOut(paymentService); // target
        checkOut.placeOrder("111-2-33",34.22);
    }
}
