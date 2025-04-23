import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Logger {

    String logFile;

    public Logger(String logFile) {
        this.logFile = logFile;
    }

    public void logAction(String userAction, String logTime) {
        try {
            FileWriter writer = new FileWriter("C:\\Users\\rosen\\pluralsight\\workbook-3\\testSearchEngineLooper\\src\\main\\resources\\logs.txt", true);
            writer.write(logTime + " " + userAction + "\n");

            writer.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
            System.err.println("ERROR");
        }
    }

}
