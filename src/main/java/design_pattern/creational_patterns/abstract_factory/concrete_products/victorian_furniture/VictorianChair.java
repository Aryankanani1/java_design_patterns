package design_pattern.creational_patterns.abstract_factory.concrete_products.victorian_furniture;

import design_pattern.creational_patterns.abstract_factory.abstract_products.Chair;

public class VictorianChair implements Chair {
    @Override
    public void sit() {
        System.out.println("victorian chair very expensive");
    }
}
