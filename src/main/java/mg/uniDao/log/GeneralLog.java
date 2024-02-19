package mg.uniDao.log;

import java.time.LocalDateTime;

public class GeneralLog {
    private static final String INFO_COLOR = "\u001B[34m";
    private static final String ERROR_COLOR = "\u001B[31m";
    private static final String WARNING_COLOR = "\u001B[33m";
    private static final String WHITE_COLOR = "\u001B[37m";
    private static final String RESET_COLOR = "\u001B[0m";

    public static void print(String message, String color) {
        System.out.print(color + message + RESET_COLOR);
    }

    public static void println(String message, String color) {
        print(message + "\n", color);
    }

    public static void printQuery(String query) {
        print("[" + LocalDateTime.now() + "] ", WARNING_COLOR);
        print("QUERY: ", INFO_COLOR);
        println(query, WHITE_COLOR);
    }
}