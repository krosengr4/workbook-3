package com.pluralsight;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WritingToFiles {

    public static void main(String[] args) {
        //calling methods
        fileWriter();
        bufferedFileWriter();

    }

    static public void fileWriter() {
        try {
            //open the file writer
            FileWriter writer = new FileWriter("\\Users\\rosen\\pluralsight\\workbook-3\\ClassNotes\\src\\main\\resources\\skills.txt");
//            FileWriter writer = new FileWriter("skills.txt");

            //write to the file
            writer.write("Skills: \n");
            writer.write("Git, HTML, CSS, Bootstrap\n");
            writer.write("JavaScript/ES6, jQuery, REST API, Node.js\n");
            writer.write("Python, Java\n");
            writer.write("Kevin Rosengren");

            //close the writer when done
            writer.close();

        } catch (IOException e) {
            System.out.println(e.getMessage());
            System.err.println("ERROR");
        }
    }

    static public void bufferedFileWriter() {

        try {
            //create a file writer
            FileWriter fileWriter = new FileWriter("C:\\Users\\rosen\\pluralsight\\workbook-3\\ClassNotes\\src\\main\\resources\\text.txt");

            //Create a buffered writer
            BufferedWriter bufWriter = new BufferedWriter(fileWriter);

            //write to the file
            String text;
            for (int i = 0; i <= 10; i++) {
                text = String.format("Counting %d\n", i);
                bufWriter.write(text);
            }

            //close the writer
            bufWriter.close();

        } catch (IOException e) {
            System.out.println(e.getMessage());
            System.err.println("ERROR");
        }
    }
}
