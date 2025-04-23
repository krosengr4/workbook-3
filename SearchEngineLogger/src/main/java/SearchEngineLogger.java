import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class SearchEngineLogger {

    public static void main(String[] args) {

        //Get and format the local date and time
        LocalDateTime dateTime = LocalDateTime.now();
        DateTimeFormatter gmt = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String logTime = dateTime.format(gmt);

        try {
            //Create writer to log start time
            FileWriter writer = new FileWriter("C:\\Users\\rosen\\pluralsight\\workbook-3\\SearchEngineLogger\\src\\main\\resources\\logs.txt");
            writer.write(logTime + " Launch.");

            writer.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
            System.err.println("ERROR");
        }

        //collect user input
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter a search term (X to exit): ");
        String userInput = myScanner.nextLine();

        if (userInput.equals("x")) {
            userInput = userInput.toUpperCase();
        }

        //if statement to determine whether to exit or search for a term
        if (userInput.equals("X")) {
            exit(logTime);
        } else {
            logActions(userInput, logTime);
        }
    }

    static public void logActions(String userInput, String logTime) {

        try {
            //Open file writer
            FileWriter writer = new FileWriter("C:\\Users\\rosen\\pluralsight\\workbook-3\\SearchEngineLogger\\src\\main\\resources\\logs.txt");

            //Create a buffered writer
            BufferedWriter bufWriter = new BufferedWriter(writer);

            //write user input to file
            bufWriter.write("Your log actions \n");
            bufWriter.write(logTime + " " + userInput + "\n");

            bufWriter.close();

        } catch (IOException e) {
            System.out.println(e.getMessage());
            System.err.println("ERROR");
        }
    }

    static public void exit(String logTime) {

        System.out.println(logTime);
        try {
            FileWriter writer = new FileWriter("C:\\Users\\rosen\\pluralsight\\workbook-3\\SearchEngineLogger\\src\\main\\resources\\logs.txt");

            // log time that user exited
            writer.write(logTime + " Exit.");
            writer.close();

        } catch (IOException e) {
            System.out.println(e.getMessage());
            System.err.println("ERROR");
        }

        System.out.println("Thank you! :)");
    }

}
