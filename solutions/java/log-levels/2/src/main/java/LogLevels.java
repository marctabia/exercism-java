public class LogLevels {
    
    public static String message(String logLine) {
        String[] message = logLine.split(":");
        return message[1].trim();
    }

    public static String logLevel(String logLine) {
        String regex = "[\\[\\]]";
        String[] splitLevel = logLine.split(regex);
        return splitLevel[1].toLowerCase();
    }

    public static String reformat(String logLine) {
        String errorMsg = message(logLine);
        String level = logLevel(logLine);
        return errorMsg.concat(" (").concat(level).concat(")");
    }
}
