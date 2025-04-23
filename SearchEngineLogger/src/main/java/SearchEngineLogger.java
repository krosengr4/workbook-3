import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class SearchEngineLogger {

    public static void main(String[] args) {
        //Get and format local time and date
        LocalDateTime dateTime = LocalDateTime.now();
        DateTimeFormatter gmt = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String logTime = dateTime.format(gmt);

        //Create new instance of logger pointing to right file
        Logger logger = new Logger("C:\\Users\\rosen\\pluralsight\\workbook-3\\SearchEngineLogger\\src\\main\\resources\\logs.txt");
        logger.logAction("Launch", logTime + "\n");

        //Create instance of scanner
        Scanner myScanner = new Scanner(System.in);

        while(true){
            //Prompt user
            System.out.println("Enter a search term (X to exit): ");
            String userInput = myScanner.nextLine();

            //if user inputs x or X, exit the app
            if(userInput.equalsIgnoreCase("x")){
                logger.logAction("Exit", logTime);
                System.out.println("Exiting application. Thank you! :)");
                break;

            } else {
                // log and print what user searches for
                logger.logAction(logTime + " ",  "Searching: " + userInput + "\n");
                System.out.println("Searching for: " + userInput);
            }
        }
        //close scanner
        myScanner.close();

    }

}
