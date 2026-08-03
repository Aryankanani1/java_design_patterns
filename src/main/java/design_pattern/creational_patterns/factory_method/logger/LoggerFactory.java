package design_pattern.creational_patterns.factory_method.logger;
// factory class

public class LoggerFactory {

    public static Logger getLogger(String type){
        return switch (type){
            case "console" -> new ConsoleLogger();
            case "file" -> new FileLogger();
            case "database" -> new DatabaseLogger();
            default -> throw new IllegalArgumentException();
        };
    }

}

