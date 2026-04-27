package utils;

import io.qameta.allure.Attachment;

public class LogUtils {

    private static final StringBuilder logs = new StringBuilder();

    public static void info(String message) {
        String log = "[INFO] " + message;
        System.out.println(log);
        logs.append(log).append("\n");
    }

    public static void error(String message) {
        String log = "[ERROR] " + message;
        System.err.println(log);
        logs.append(log).append("\n");
    }

    @Attachment(value = "Execution Logs", type = "text/plain")
    public static String attachLogs() {
        return logs.toString();
    }

    public static void clearLogs() {
        logs.setLength(0);
    }
}