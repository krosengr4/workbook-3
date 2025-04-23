import java.io.FileWriter;
import java.io.IOException;

public class Logger {

    String logFile;

    public Logger(String logFile) {
        this.logFile = logFile;
    }

    public void logAction(String logTime, String userAction) {
        try {
            FileWriter writer = new FileWriter(logFile, true);
            writer.write(logTime + " - " + userAction + "\n");

            writer.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
            System.err.println("ERROR");
        }
    }
}
