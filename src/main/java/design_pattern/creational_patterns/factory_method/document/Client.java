package design_pattern.creational_patterns.factory_method.document;

// Client Code
public class Client {
    public static void main(String[] args) {
        Application app;

        // Depending on the type, create the appropriate application
        String type = "text"; // This could be determined at runtime
        if (type.equals("text")) {
            app = new TextApplication();
        } else {
            app = new SpreadSheetApplication();
        }

        // Use the factory method to create a document
        app.newDocument(); //  Output: Opening text document...
    }
}
