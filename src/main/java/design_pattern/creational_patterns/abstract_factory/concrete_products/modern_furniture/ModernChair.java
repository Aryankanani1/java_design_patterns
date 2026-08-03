package design_pattern.creational_patterns.abstract_factory.concrete_products.modern_furniture;

import design_pattern.creational_patterns.abstract_factory.abstract_products.Chair;

public class ModernChair implements Chair {
    @Override
    public void sit() {
        System.out.println("this is modern chair and you can sit on it");
    }
}
