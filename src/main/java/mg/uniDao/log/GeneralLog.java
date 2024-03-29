package mg.uniDao.log;

import java.time.LocalDateTime;

public class GeneralLog {
    public static final String INFO_COLOR = "\u001B[34m";
    public static final String ERROR_COLOR = "\u001B[31m";
    public static final String WARNING_COLOR = "\u001B[33m";
    public static final String WHITE_COLOR = "\u001B[37m";
    public static final String SECONDARY_COLOR = "\u001B[36m";
    public static final String RESET_COLOR = "\u001B[0m";

    public static void print(String message, String color) {
        System.out.print(color + message + RESET_COLOR);
    }

    public static void println(String message, String color) {
        print(message + "\n", color);
    }

    public static void printQuery(String query) {
        print("[" + LocalDateTime.now() + "] ", WHITE_COLOR);
        print("QUERY: ", INFO_COLOR);
        println(query, RESET_COLOR);
    }

    public static void printError(String message) {
        print("[" + LocalDateTime.now() + "] ", WHITE_COLOR);
        print("ERROR: ", ERROR_COLOR);
        println(message, RESET_COLOR);
    }

    public static void printWarning(String message) {
        print("[" + LocalDateTime.now() + "] ", WHITE_COLOR);
        print("WARNING: ", WARNING_COLOR);
        println(message, RESET_COLOR);
    }

    public static void printInfo(String message) {
        print("[" + LocalDateTime.now() + "] ", WHITE_COLOR);
        print("INFO: ", SECONDARY_COLOR);
        println(message, RESET_COLOR);
    }
}
