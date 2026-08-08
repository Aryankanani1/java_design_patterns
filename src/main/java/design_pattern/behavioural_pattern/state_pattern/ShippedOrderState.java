package design_pattern.behavioural_pattern.state_pattern;

public class ShippedOrderState implements OrderState{
    @Override
    public void next(Order o) {
        System.out.println("order is already shipped");
    }

    @Override
    public void cancel(Order o) {
        System.out.println("shipped order can't be cancel");
    }
}
