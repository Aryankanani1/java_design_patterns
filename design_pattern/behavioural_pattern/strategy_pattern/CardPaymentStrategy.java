package design_pattern.behavioural_pattern.strategy_pattern;

public class CardPaymentStrategy implements PaymentStrategy{
    @Override
    public void pay(double amount) {
        System.out.println("pay by card: " + amount);
    }

}
