package design_pattern.creational_patterns.factory_method.document;
// single creator class
public abstract class Application{
    protected abstract Document createDocument();
    public void newDocument(){
        Document document = createDocument();
        document.open();
    }
}
