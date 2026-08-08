package design_pattern.behavioural_pattern.state_pattern;

public class PackedOrderState implements OrderState{

    @Override
    public void next(Order o) {
        System.out.println("order moved to shipped");
        o.setOrderState(new ShippedOrderState());
    }

    @Override
    public void cancel(Order o) {
        System.out.println("packed order cancel");
    }
}
