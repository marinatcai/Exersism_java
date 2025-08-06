public class LogLevels {
    
    public static String message(String logLine) {
        // using split() method splits the string into array of substrings by regex [:]
        // return required element of the resulting array
        return logLine.split("]: ")[1].trim();
    }

    public static String logLevel(String logLine) {
        // using split() method splits the string into array of substrings by regex [:]
        // return required element of the resulting array in lower case
        return logLine.split("]: ")[0].trim().toLowerCase();
    }

    public static String reformat(String logLine) {
        // reuse the 1 and 2 methods
        // return the string in defined format "1 element (2 element)"
        return String.format("%s (%s)", LogLevels.message(logLine), LogLevels.logLevel(logLine));
    }
}
