package design_pattern.structural_pattern.adapter_pattern.adapter_mini_project;

public class CheckOut {
    private final PaymentService paymentService;

    public CheckOut(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public void placeOrder(String orderId, double amount){
            paymentService.pay(orderId,amount);
    }
}
