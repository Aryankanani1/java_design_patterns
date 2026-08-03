package CoreJava.StructuralPatterns;

// BridgePatternExample.java

// Implementor interface
interface DrawAPI {
    void drawCircle(int radius, int x, int y);
}

// Concrete implementor classes
class RedCircle implements DrawAPI {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: red, radius: " + radius + ", x: " + x + ", y: " + y + "]");
    }
}

class GreenCircle implements DrawAPI {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: green, radius: " + radius + ", x: " + x + ", y: " + y + "]");
    }
}

// Abstraction class
abstract class Shape {
    protected DrawAPI drawAPI;

    protected Shape(DrawAPI drawAPI) {
        this.drawAPI = drawAPI;
    }

    public abstract void draw();
}

// Refined abstraction class
class Circle extends Shape {
    private int x, y, radius;

    public Circle(int x, int y, int radius, DrawAPI drawAPI) {
        super(drawAPI);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public void draw() {
        drawAPI.drawCircle(radius, x, y);
    }
}

// Main class to test the Bridge pattern
public class BridgePatternExample {
    public static void main(String[] args) {
        Shape redCircle = new Circle(100, 100, 10, new RedCircle());
        Shape greenCircle = new Circle(100, 100, 10, new GreenCircle());

        redCircle.draw(); // Output: Drawing Circle[ color: red, radius: 10, x: 100, y: 100]
        greenCircle.draw(); // Output: Drawing Circle[ color: green, radius: 10, x: 100, y: 100]
    }
}
