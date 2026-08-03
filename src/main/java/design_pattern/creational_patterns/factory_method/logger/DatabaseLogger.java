package design_pattern.creational_patterns.factory_method.logger;
// concrete product class
public class DatabaseLogger implements Logger{
    @Override
    public void log(String message) {
        System.out.println("database logger:" + message);
    }
}
