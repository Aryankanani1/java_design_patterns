package design_pattern.creational_patterns.abstract_factory.concrete_factories;

import design_pattern.creational_patterns.abstract_factory.factory.FurnitureFactory;
import design_pattern.creational_patterns.abstract_factory.abstract_products.Chair;
import design_pattern.creational_patterns.abstract_factory.abstract_products.CoffeeTable;
import design_pattern.creational_patterns.abstract_factory.abstract_products.Sofa;
import design_pattern.creational_patterns.abstract_factory.concrete_products.victorian_furniture.VictorianChair;
import design_pattern.creational_patterns.abstract_factory.concrete_products.victorian_furniture.VictorianCoffeeTable;
import design_pattern.creational_patterns.abstract_factory.concrete_products.victorian_furniture.VictorianSofa;

public class VictorianFurniture extends FurnitureFactory {

    @Override
    public Sofa createSofa() {
        return new VictorianSofa();
    }

    @Override
    public Chair createChair() {
        return new VictorianChair();
    }

    @Override
    public CoffeeTable createCoffeeTable() {
        return new VictorianCoffeeTable();
    }
}
