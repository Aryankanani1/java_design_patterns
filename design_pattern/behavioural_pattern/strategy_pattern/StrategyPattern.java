package design_pattern.behavioural_pattern.strategy_pattern;

public class StrategyPattern {
    public static void main(String[] args) {
        Checkout checkout = new Checkout(new UpiPaymentStrategy());
        checkout.pay(100.00);
    }
}
