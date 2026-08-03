package design_pattern.creational_patterns.abstract_factory.concrete_factories;

import design_pattern.creational_patterns.abstract_factory.factory.FurnitureFactory;
import design_pattern.creational_patterns.abstract_factory.abstract_products.Chair;
import design_pattern.creational_patterns.abstract_factory.abstract_products.CoffeeTable;
import design_pattern.creational_patterns.abstract_factory.abstract_products.Sofa;
import design_pattern.creational_patterns.abstract_factory.concrete_products.modern_furniture.ModernChair;
import design_pattern.creational_patterns.abstract_factory.concrete_products.modern_furniture.ModernCoffeeTable;
import design_pattern.creational_patterns.abstract_factory.concrete_products.modern_furniture.ModernSofa;

public class ModernFurniture extends FurnitureFactory {
    @Override
    public Sofa createSofa() {
        return new ModernSofa();
    }
    @Override
    public Chair createChair() {
        return new ModernChair();
    }

    @Override
    public CoffeeTable createCoffeeTable() {
        return new ModernCoffeeTable();
    }
}
