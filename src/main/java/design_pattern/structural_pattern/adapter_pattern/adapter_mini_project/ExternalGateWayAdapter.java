package design_pattern.structural_pattern.adapter_pattern.adapter_mini_project;

public class ExternalGateWayAdapter implements PaymentService{
    private final LagacyPaymentGateWay lagacyPaymentGateWay;
    public ExternalGateWayAdapter (LagacyPaymentGateWay lagacyPaymentGateWay){
        this.lagacyPaymentGateWay = lagacyPaymentGateWay;
    }
    @Override
    public void pay(String orderId, double amount) {
        lagacyPaymentGateWay.sendMoney(orderId,String.valueOf(amount));
    }
}
