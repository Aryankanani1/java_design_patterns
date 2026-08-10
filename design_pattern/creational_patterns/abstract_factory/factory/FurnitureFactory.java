package design_pattern.creational_patterns.abstract_factory.factory;

import design_pattern.creational_patterns.abstract_factory.abstract_products.Chair;
import design_pattern.creational_patterns.abstract_factory.abstract_products.CoffeeTable;
import design_pattern.creational_patterns.abstract_factory.abstract_products.Sofa;

public abstract class FurnitureFactory {

   public  abstract Sofa createSofa();
    public abstract Chair createChair();
    public abstract CoffeeTable createCoffeeTable();

    public void furniture(){
        Chair chair = createChair();
        chair.sit();
        Sofa sofa = createSofa();
        sofa.relax();
        CoffeeTable coffeeTable = createCoffeeTable();
        coffeeTable.placeCup();
    }
}
