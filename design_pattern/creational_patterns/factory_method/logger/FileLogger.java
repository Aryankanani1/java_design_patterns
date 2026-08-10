package design_pattern.creational_patterns.factory_method.logger;

public class FileLogger implements Logger {

    @Override
    public void log(String message) {
        System.out.println("file logger:" + message);
    }
}

