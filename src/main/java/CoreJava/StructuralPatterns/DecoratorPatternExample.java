package CoreJava.StructuralPatterns;

// DecoratorPatternExample.java

// Component interface
interface Shape2 {
    void draw();
}

// Concrete component class
class Circle2 implements Shape2 {
    @Override
    public void draw() {
        System.out.println("Shape: Circle");
    }
}

// Concrete component class
class Rectangle implements Shape2 {
    @Override
    public void draw() {
        System.out.println("Shape: Rectangle");
    }
}

// Decorator class implementing the same interface
abstract class ShapeDecorator implements Shape2 {
    protected Shape2 decoratedShape;

    public ShapeDecorator(Shape2 decoratedShape) {
        this.decoratedShape = decoratedShape;
    }

    public void draw() {
        decoratedShape.draw();
    }
}

// Concrete decorator class
class RedShapeDecorator2 extends ShapeDecorator {

    public RedShapeDecorator2(Shape2 decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        setRedBorder(decoratedShape);
    }

    private void setRedBorder(Shape2 decoratedShape) {
        System.out.println("Border Color: Red");
    }
}

// Main class to test the Decorator pattern
public class DecoratorPatternExample {
    public static void main(String[] args) {
        Shape2 circle = new Circle2();
        Shape2 redCircle = new RedShapeDecorator2(new Circle2());
        Shape2 redRectangle = new RedShapeDecorator2(new Rectangle());

        System.out.println("Circle with normal border"); // Output: Circle with normal border
        circle.draw(); // Output: Shape: Circle

        System.out.println("\nCircle with red border"); // Output: Circle with red border
        redCircle.draw(); // Output: Shape: Circle
                          //         Border Color: Red

        System.out.println("\nRectangle with red border"); // Output: Rectangle with red border
        redRectangle.draw(); // Output: Shape: Rectangle
                             //         Border Color: Red
    }
}
