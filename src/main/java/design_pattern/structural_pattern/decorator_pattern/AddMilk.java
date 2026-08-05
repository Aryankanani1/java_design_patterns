package design_pattern.structural_pattern.decorator_pattern;

public class AddMilk extends CoffeeDecorator{

    public AddMilk(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + ", milk";
    }

    @Override
    public double getCost() {
        return coffee.getCost() + 1.00;
    }
}
