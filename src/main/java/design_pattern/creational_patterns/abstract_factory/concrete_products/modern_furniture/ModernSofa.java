package design_pattern.creational_patterns.abstract_factory.concrete_products.modern_furniture;

import design_pattern.creational_patterns.abstract_factory.abstract_products.Sofa;

public class ModernSofa implements Sofa {
    @Override
    public void relax() {
        System.out.println("modern sofa please take a rest");
    }
}
