package design_pattern.creational_patterns.abstract_factory;

import design_pattern.creational_patterns.abstract_factory.factory.FurnitureFactory;
import design_pattern.creational_patterns.abstract_factory.concrete_factories.ModernFurniture;

public class Room {
    public static void main(String[] args) {
        FurnitureFactory furnitureFactory = new ModernFurniture();
         furnitureFactory.furniture();
    }
}
