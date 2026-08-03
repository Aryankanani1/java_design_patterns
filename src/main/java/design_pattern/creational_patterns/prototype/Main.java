package design_pattern.creational_patterns.prototype;

public class Main {
    public static void main(String[] args) {
        ProtoTypeRegistry protoTypeRegistry = new ProtoTypeRegistry();
        GeneralReport report = protoTypeRegistry.getReport("SALES");
        report.print();
    }
}
