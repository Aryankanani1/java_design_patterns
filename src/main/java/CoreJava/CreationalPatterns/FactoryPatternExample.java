package CoreJava.CreationalPatterns;

// Product interface
interface Shape {
    void draw();
}

// Concrete product classes
class Circle implements Shape {
    public void draw() {
        System.out.println("Drawing Circle");
    }
}

class Rectangle implements Shape {
    public void draw() {
        System.out.println("Drawing Rectangle");
    }
}

// Factory class
class ShapeFactory {
    // Method to get an object of type Shape
    public Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        if (shapeType.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        }
        return null;
    }
}

// Main class to test the Factory pattern
public class FactoryPatternExample {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        // Get an object of Circle and call its draw method
        Shape shape1 = shapeFactory.getShape("CIRCLE");
        shape1.draw(); // Output: Drawing Circle

        // Get an object of Rectangle and call its draw method
        Shape shape2 = shapeFactory.getShape("RECTANGLE");
        shape2.draw(); // Output: Drawing Rectangle
    }
}
