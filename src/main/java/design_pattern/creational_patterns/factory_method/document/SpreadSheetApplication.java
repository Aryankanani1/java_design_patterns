package design_pattern.creational_patterns.factory_method.document;
// concrete creator classes
public class SpreadSheetApplication extends Application{

    @Override
    protected Document createDocument() {
        return new SpreadSheet();
    }
}
