package design_pattern.structural_pattern.decorator_pattern;

abstract class CoffeeDecorator implements Coffee{
    protected final Coffee coffee;

    public CoffeeDecorator(Coffee coffee) {
        this.coffee = coffee;
    }

}
