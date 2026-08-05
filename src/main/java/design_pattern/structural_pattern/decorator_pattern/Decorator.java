package design_pattern.structural_pattern.decorator_pattern;

public class Decorator {
    public static void main(String[] args) {
        Coffee coffee = new SimpleCoffee();
        coffee = new AddSugar(coffee);
        coffee = new AddMilk(coffee);


        System.out.println(coffee.getDescription());
        System.out.println(coffee.getCost());
    }
}
