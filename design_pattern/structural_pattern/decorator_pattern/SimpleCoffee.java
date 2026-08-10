package design_pattern.structural_pattern.decorator_pattern;
// base class
public class SimpleCoffee implements Coffee{

    @Override
    public String getDescription() {
        return "this is simple coffee";
    }

    @Override
    public double getCost() {
        return 3.49;
    }
}
