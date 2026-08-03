package CoreJava.StructuralPatterns;

// FlyweightPatternExample.java

import java.util.HashMap;

// Flyweight interface
interface Shape4 {
    void draw();
}

// ConcreteFlyweight class
class Circle4 implements Shape4 {
    private String color;
    private int x;
    private int y;
    private int radius;

    public Circle4(String color) {
        this.color = color;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Circle: Draw() [Color : " + color + ", x : " + x + ", y :" + y + ", radius :" + radius);
    }
}

// FlyweightFactory class
class ShapeFactory {
    private static final HashMap<String, Shape4> circleMap = new HashMap<>();

    public static Shape4 getCircle(String color) {
        Circle4 circle = (Circle4) circleMap.get(color);

        if (circle == null) {
            circle = new Circle4(color);
            circleMap.put(color, circle);
            System.out.println("Creating circle of color : " + color);
        }
        return circle;
    }
}

// Main class to test the Flyweight pattern
public class FlyweightPatternExample {
    private static final String colors[] = {"Red", "Green", "Blue", "White", "Black"};

    public static void main(String[] args) {
        for (int i = 0; i < 20; ++i) {
            Circle4 circle = (Circle4) ShapeFactory.getCircle(getRandomColor());
            circle.setX(getRandomX());
            circle.setY(getRandomY());
            circle.setRadius(100);
            circle.draw();
        }
    }

    private static String getRandomColor() {
        return colors[(int) (Math.random() * colors.length)];
    }

    private static int getRandomX() {
        return (int) (Math.random() * 100);
    }

    private static int getRandomY() {
        return (int) (Math.random() * 100);
    }

//    Output:
//    Creating circle of color : Black
//    Circle: Draw() [Color : Black, x : 4, y :17, radius :100
//    Circle: Draw() [Color : Black, x : 13, y :67, radius :100
//    Creating circle of color : Blue
//    Circle: Draw() [Color : Blue, x : 75, y :56, radius :100
//    Creating circle of color : Green
//    Circle: Draw() [Color : Green, x : 82, y :14, radius :100
//    Creating circle of color : Red
//    Circle: Draw() [Color : Red, x : 93, y :49, radius :100
//    Circle: Draw() [Color : Black, x : 84, y :79, radius :100
//    Circle: Draw() [Color : Black, x : 45, y :24, radius :100
//    Circle: Draw() [Color : Red, x : 0, y :88, radius :100
//    Circle: Draw() [Color : Black, x : 14, y :23, radius :100
//    Circle: Draw() [Color : Green, x : 31, y :12, radius :100
//    Circle: Draw() [Color : Red, x : 36, y :71, radius :100
//    Creating circle of color : White
//    Circle: Draw() [Color : White, x : 18, y :86, radius :100
//    Circle: Draw() [Color : Black, x : 74, y :5, radius :100
//    Circle: Draw() [Color : Red, x : 62, y :36, radius :100
//    Circle: Draw() [Color : Green, x : 5, y :50, radius :100
//    Circle: Draw() [Color : White, x : 75, y :1, radius :100
//    Circle: Draw() [Color : Black, x : 90, y :15, radius :100
//    Circle: Draw() [Color : White, x : 46, y :75, radius :100
//    Circle: Draw() [Color : Black, x : 77, y :75, radius :100
//    Circle: Draw() [Color : White, x : 66, y :52, radius :100
}
