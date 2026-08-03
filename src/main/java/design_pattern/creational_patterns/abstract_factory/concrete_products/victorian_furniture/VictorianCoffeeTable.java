package design_pattern.creational_patterns.abstract_factory.concrete_products.victorian_furniture;

import design_pattern.creational_patterns.abstract_factory.abstract_products.CoffeeTable;

public class VictorianCoffeeTable implements CoffeeTable {

    @Override
    public void placeCup() {
        System.out.println("victorian coffee table only place golden cup");
    }
}
