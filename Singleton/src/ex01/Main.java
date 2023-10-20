package ex01;


/*
 Imagine you want to create a logging service that logs messages throughout your Java application.
 You want to ensure that there's only one instance of the logger to avoid multiple log files or conflicting log entries.
 Here's a simple Singleton-based logging service:
*/

class Logger {
    private static Logger instance;
    private String logFile;

    // Private constructor to prevent instantiation from other classes
    private Logger() {
        logFile = "application.log";
    }

    // Public method to get the instance of the Logger class
    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    // Method to log a message
    public void log(String message) {
        System.out.println("Logging to " + logFile + ": " + message);
    }
}

public class Main {
    public static void main(String[] args) {
        // Get the Logger instance
        Logger logger = Logger.getInstance();

        // Log messages
        logger.log("This is a log message.");
        logger.log("Another log message.");

        // Both log calls use the same Logger instance
    }
}
