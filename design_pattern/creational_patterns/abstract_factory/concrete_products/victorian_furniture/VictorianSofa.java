package design_pattern.creational_patterns.abstract_factory.concrete_products.victorian_furniture;

import design_pattern.creational_patterns.abstract_factory.abstract_products.Sofa;

public class VictorianSofa implements Sofa {
    @Override
    public void relax() {
        System.out.println("victorian not conformable");
    }
}
