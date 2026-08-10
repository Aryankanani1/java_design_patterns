package design_pattern.creational_patterns.factory_method.logger;

public class TestLogger {
    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger("database");
        logger.log("this is database logger");

        Logger filelogger = LoggerFactory.getLogger("file");
        filelogger.log("this is file logger");

        Logger consoleLogger = LoggerFactory.getLogger("console");
        consoleLogger.log("this is console logger");

    }
}
