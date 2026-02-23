public class LogLevels {
    
    public static String message(String logLine) {
        String[] message = logLine.split(":");
        return message[1].trim();
    }

    public static String logLevel(String logLine) {
        String level = "";
        String regex = "[\\[\\]]";
        if (logLine.contains("ERROR") || logLine.contains("WARNING") || logLine.contains("INFO")) {
            String[] splitLevel = logLine.split(regex);
            level = splitLevel[1].toLowerCase();
        }
        return level;
    }

    public static String reformat(String logLine) {
        String errorMsg = message(logLine);
        String level = logLevel(logLine);
        return errorMsg.concat(" (").concat(level).concat(")");
    }
}
