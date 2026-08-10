package design_pattern.creational_patterns.factory_method.document;
// concrete creator classes
public class TextApplication extends Application{

    @Override
    protected Document createDocument() {
        return new TextDocument();
    }
}

