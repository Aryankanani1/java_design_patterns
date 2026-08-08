package design_pattern.behavioural_pattern.state_pattern;

public class NewOrderState implements OrderState{
    @Override
    public void next(Order o) {
        System.out.println("order is placed");
        o.setOrderState(new PackedOrderState());
    }

    @Override
    public void cancel(Order o) {
        System.out.println("new order cancelled");
    }
}
