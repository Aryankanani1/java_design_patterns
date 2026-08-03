package CoreJava.StructuralPatterns;

// FacadePatternExample.java

// Subsystem classes
class ShapeMaker {
    private Shape3 circle;
    private Shape3 rectangle;
    private Shape3 square;

    public ShapeMaker() {
        circle = new Circle3();
        rectangle = new Rectangle3();
        square = new Square();
    }

    public void drawCircle() {
        circle.draw();
    }

    public void drawRectangle() {
        rectangle.draw();
    }

    public void drawSquare() {
        square.draw();
    }
}

// Shape interface and its implementations
interface Shape3 {
    void draw();
}

class Circle3 implements Shape3 {
    @Override
    public void draw() {
        System.out.println("Circle::draw()");
    }
}

class Rectangle3 implements Shape3 {
    @Override
    public void draw() {
        System.out.println("Rectangle::draw()");
    }
}

class Square implements Shape3 {
    @Override
    public void draw() {
        System.out.println("Square::draw()");
    }
}

// Main class to test the Facade pattern
public class FacadePatternExample {
    public static void main(String[] args) {
        ShapeMaker shapeMaker = new ShapeMaker();

        shapeMaker.drawCircle(); // Output: Circle::draw()
        shapeMaker.drawRectangle(); // Output: Rectangle::draw()
        shapeMaker.drawSquare(); // Output: Square::draw()
    }
}
