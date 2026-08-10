package design_pattern.behavioural_pattern.strategy_pattern;

public class UpiPaymentStrategy implements PaymentStrategy{

    @Override
    public void pay(double amount) {
        System.out.println("paid by UPI: " +amount);
    }
}
