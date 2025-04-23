import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Get and format the local date and time
        LocalDateTime dateTime = LocalDateTime.now();
        DateTimeFormatter gmt = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String logTime = dateTime.format(gmt);

        Logger logger = new Logger("../logs.txt");
        logger.logAction("Launch", logTime);


        Scanner myScanner = new Scanner(System.in);

        while (true){

            System.out.println("Enter a search term (X to exit): ");
            String userInput = myScanner.nextLine();

            if(userInput.equalsIgnoreCase("x")) {
                logger.logAction("exit", logTime);
                System.out.println("Exiting application. \nThank you! :)");
                break;
            } else {
                logger.logAction("Searching: ", logTime + userInput);
                System.out.println("Searching for: " + userInput);

            }
        }
        myScanner.close();
    }
}
