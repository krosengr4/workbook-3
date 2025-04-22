package com.pluralsight.fileScanner;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class fileScanner {

    public static void main(String[] args) {

        fileIo();

    }

    //! The com.pluralsight.Scanner class can be used to read a file.
    static void fileIo() {

        FileInputStream fis = null;
        try {
            //Create FileInput Stream that points to a specific file.
            fis = new FileInputStream("C:/Users/rosen/pluralsight/workbook-3/ClassNotes/src/main/java/com/pluralsight/fileScanner/poem.txt");

            //Create an instance of scanner to read the file above
            Scanner myScanner = new Scanner(fis);

            String input;

            //Create while loop to read the file until there is no more lines to read and print out
            while (myScanner.hasNextLine()) {
                input = myScanner.nextLine();
                System.out.println(input);
            }

            // Close the scanner and release the resources
            myScanner.close();

            // include a catch in case the file was not found
        } catch (Exception e) {
            System.out.println("ERROR! File was not found.");
        }

    }
}
