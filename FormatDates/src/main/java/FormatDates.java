import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormatDates {

    public static void main(String[] args) {

        //Creating variables for the date + date and time right now
        LocalDate todayDate = LocalDate.now();
        LocalDateTime todayDateTime = LocalDateTime.now();

        //Setting the formats that we went for date and time
        DateTimeFormatter mdy = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        DateTimeFormatter monthName = DateTimeFormatter.ofPattern("MMMM d, yyyy");
        DateTimeFormatter gmt = DateTimeFormatter.ofPattern("EEEE, MMM d, yyyy HH:mm");

        //Formatting the date and time
        String mdyFormat = todayDate.format(mdy);
        String fullMonthName = todayDate.format(monthName);
        String gmtTime = todayDateTime.format(gmt);

        //Print out results
        System.out.println("Today's date: " + mdyFormat);
        System.out.println("Today's date: " + todayDate);
        System.out.println("Today's date: " + fullMonthName);
        System.out.println("Date and Time: " + gmtTime);
    }

}
