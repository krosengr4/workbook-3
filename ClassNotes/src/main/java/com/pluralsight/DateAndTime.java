package com.pluralsight;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateAndTime {

    public static void main(String[] args) {
        //calling methods for each subsection
        localDate();
        localTime();
        dateTimeFormatter();
        stringToDate();
    }

    //! Getting the date of where your device is now
    static void localDate() {
        //how to get the current local date
        LocalDate today = LocalDate.now();
        System.out.println("Today is: " + today);

        //how to get both current local date and time
        LocalDateTime rightNow = LocalDateTime.now();
        System.out.println("Right now it is: " + rightNow);

        //how to get day of week, month, and year
        System.out.println("Day of the week: " + today.getDayOfWeek());
        System.out.println("Day of the month: " + today.getDayOfMonth());
        System.out.println("Day of the year: " + today.getDayOfYear());
        System.out.println("Month: " + today.getMonth());
        System.out.println("Month value: " + today.getMonthValue());
        System.out.println("Year: " + today.getYear());
    }

    //! Getting the time of where your device is
    static void localTime() {
        // how to get the current local time
        LocalTime currentTime = LocalTime.now();
        System.out.println("The current time is: " + currentTime);

        //How to get the specific hour minute second and nanosecond
        System.out.println("Hour: " + currentTime.getHour());
        System.out.println("Minute: " + currentTime.getMinute());
        System.out.println("Second: " + currentTime.getSecond());
        System.out.println("Nanosecond: " + currentTime.getNano());
    }

    //!Formatting the date and time
    static void dateTimeFormatter() {
        LocalDateTime today = LocalDateTime.now();

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("E, MM dd, yyyy, HH:mm:ss");
        String formattedDate = today.format(fmt);
        System.out.println("Today formatted is: " + formattedDate);

    }

    //! Converting a string to a date
    static void stringToDate() {

        String userInput = "2024-11-07";
        LocalDate birthDay = LocalDate.parse(userInput);

        //parsing userInput for whatever format they use
        String userInput2 = "02/05/2025";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        //prints out in format of "yyyy-MM-dd"
        LocalDate date = LocalDate.parse(userInput2, formatter);
        System.out.println("Parsed user input date: " + date);

    }

}
