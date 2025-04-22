package com.pluralsight;

import java.io.FileInputStream;
import java.util.Scanner;
import java.io.InputStream;

public class fileScanner {

    public static void main(String[] args) {

//        fileIo();

        fileScanner();
    }

    //! The com.pluralsight.Scanner class can be used to read a file.
    static void fileScanner() {
        InputStream is = fileScanner.class.getResourceAsStream("/poem.txt");

//        if (is == null) {
//            System.out.println("ERROR! File not Found!");
//            return;
//        }
        try (Scanner myScanner = new Scanner(is)) {
            while (myScanner.hasNextLine()) {
                System.out.println(myScanner.nextLine());
            }
            } catch(Exception e){
                System.out.println("ERROR! File not found");
            }

    }

    // Another way to do this
    static void fileIo() {
        FileInputStream fis = null;
        try {
            //Create FileInput Stream that points to a specific file.
            fis = new FileInputStream("/Users/rosen/pluralsight/workbook-3/ClassNotes/src/main/resources/poem.txt");

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
