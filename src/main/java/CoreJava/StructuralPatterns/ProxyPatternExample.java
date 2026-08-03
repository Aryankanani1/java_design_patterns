package CoreJava.StructuralPatterns;

// ProxyPatternExample.java

// Subject interface
interface Image {
    void display();
}

// RealSubject class
class RealImage implements Image {
    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadFromDisk(fileName);
    }

    private void loadFromDisk(String fileName) {
        System.out.println("Loading " + fileName);
    }

    @Override
    public void display() {
        System.out.println("Displaying " + fileName);
    }
}

// Proxy class
class ProxyImage implements Image {
    private RealImage realImage;
    private String fileName;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if (realImage == null) {
            realImage = new RealImage(fileName);
        }
        realImage.display();
    }
}

// Main class to test the Proxy pattern
public class ProxyPatternExample {
    public static void main(String[] args) {
        Image image = new ProxyImage("test_10mb.jpg"); // Output: Loading test_10mb.jpg

        // Image will be loaded from disk
        image.display(); // Output: Displaying test_10mb.jpg
        System.out.println("");

        // Image will not be loaded from disk
        image.display(); // Output: Displaying test_10mb.jpg
    }
}
