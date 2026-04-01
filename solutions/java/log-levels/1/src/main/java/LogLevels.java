public class LogLevels {
    
    public static String message(String logLine) {
        String logMessage;

        boolean isFound = logLine.contains("INFO");
        if (isFound) {
            // The regex [,\\.\\s] splits the string by commas (,), spaces (\\s), and periods (\\.)
            String regex = ":";

            // using split() method
            String[] arr = logLine.split(regex,2);

            // Print each element of the resulting array
            logMessage = arr[1].trim();
        }

        isFound = logLine.contains("ERROR");
        if (isFound) {
            String regex = ":";
            String[] arr = logLine.split(regex,2);
            logMessage = arr[1].trim();
        }

        isFound = logLine.contains("WARNING");
        if (isFound) {
            String regex = ":";
            String[] arr = logLine.split(regex,2);
            logMessage = arr[1].trim();
        }
        return logMessage;
    }

    public static String logLevel(String logLine) {
        String logLevel;

        boolean isFound = logLine.contains("INFO");
        if (isFound) {
            String regex = ":";
            String[] arr = logLine.split(regex,2);
            logLevel = arr[0].trim().toLowerCase();
        }

        isFound = logLine.contains("ERROR");
        if (isFound) {
            String regex = ":";
            String[] arr = logLine.split(regex,2);
            logLevel = arr[0].trim().toLowerCase();
        }

        isFound = logLine.contains("WARNING");
        if (isFound) {
            String regex = ":";
            String[] arr = logLine.split(regex,2);
            logLevel = arr[0].trim().toLowerCase();
        }
        return logLevel;
    }

    public static String reformat(String logLine) {

        String reformatLog;

        // concatenate strings, change order of text
        boolean isFound = logLine.contains("INFO");
        if (isFound) {
            String regex = ":";
            String[] arr = logLine.split(regex,2);
            reformatLog = arr[1].trim() + "(" + arr[0].trim().toLowerCase() + ")";
        }

        isFound = logLine.contains("ERROR");
        if (isFound) {
            String regex = ":";
            String[] arr = logLine.split(regex,2);
            reformatLog = arr[1].trim() + "(" + arr[0].trim().toLowerCase() + ")";
        }

        isFound = logLine.contains("WARNING");
        if (isFound) {
            String regex = ":";
            String[] arr = logLine.split(regex,2);
            reformatLog = arr[1].trim() + "(" + arr[0].trim().toLowerCase() + ")";
        }

        return reformatLog;
    }
}
