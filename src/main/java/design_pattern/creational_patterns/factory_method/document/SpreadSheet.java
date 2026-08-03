package design_pattern.creational_patterns.factory_method.document;

public class SpreadSheet implements Document{

    @Override
    public void open() {
        System.out.println("open spreadsheet document");
    }

    @Override
    public void close() {
        System.out.println("close spreadsheet document");
    }

    @Override
    public void save() {
        System.out.println("save spreadsheet document");
    }
}
