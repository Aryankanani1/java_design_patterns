package design_pattern.creational_patterns.factory_method.logger;

public class ConsoleLogger implements Logger{
    @Override
    public void log(String message) {
        System.out.println("console logger:" + message);
    }
}
