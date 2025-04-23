package com.pluralsight;

import java.io.FileWriter;
import java.io.IOException;

public class WritingToFiles {

    public static void main(String[] args) {

        try{
            //open the file writer
            FileWriter writer = new FileWriter("skills.txt");

            //write to the file
            writer.write("Skills: \n");
            writer.write("Git, HTML, CSS, Bootstrap\n");
            writer.write("JavaScript/ES6, jQuery, REST API, Node.js\n");
            writer.write("Python, Java");

            //close the writer when done
            writer.close();

        } catch (IOException e){
            System.out.println(e.getMessage());
            System.err.println("ERROR");
        }

    }

}
