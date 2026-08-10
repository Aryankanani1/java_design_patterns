package design_pattern.creational_patterns.factory_method.document;

public class TextDocument implements Document {
    @Override
    public void open() {
        System.out.println("open text document");
    }

    @Override
    public void close() {
        System.out.println("close text document");
    }

    @Override
    public void save() {
        System.out.println("save text document");
    }
}
