package design_pattern.structural_pattern.decorator_pattern;

public class AddSugar extends CoffeeDecorator{

    public AddSugar(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + ", sugar";
    }

    @Override
    public double getCost() {
        return coffee.getCost() + 1.00;
    }
}
