package design_pattern.creational_patterns.abstract_factory.concrete_products.modern_furniture;

import design_pattern.creational_patterns.abstract_factory.abstract_products.CoffeeTable;

public class ModernCoffeeTable implements CoffeeTable {

    @Override
    public void placeCup() {
        System.out.println("this is modern coffeeTable drink coffee");
    }
}
