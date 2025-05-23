import java.io.InputStream;
import java.util.Scanner;

public class BedtimeStories {

    public static void main(String[] args) {

        int i;
        //Multi Dimensional Book titles and file paths
        String[][] books = {
                {
                        "Goldilocks and the three bears",
                        "Hansel and Gretel",
                        "Mary had a little lamb"
                },
                {
                        "/DataFiles/goldilocks.txt",
                        "/DataFiles/hansel_and_gretel.txt",
                        "/DataFiles/mary_had_a_little_lamb.txt"
                }
        };

        //Open scanner
        Scanner userPrompt = new Scanner(System.in);

        //Print all the book titles
        for (i = 0; i < books[0].length; ++i) {
            System.out.println((i + 1) + ": " + books[0][i]);
        }

        //Get user input
        System.out.println("\n Choose a number 1 - " + books[1].length + " to choose a bedtime story to read: ");
        int userInput = userPrompt.nextInt();

        //Call readStory method with the correct filepath
        if(userInput > 0 && userInput <= books[1].length){
            readStory(books[1][userInput-1]);
        } else {
            System.err.println("ERROR: User input out of bounds!");
        }
    }

    // Method to print out story
    static void readStory(String fileName) {
        //open InputStream to read file
        InputStream is = BedtimeStories.class.getResourceAsStream(fileName);

        try (Scanner readStory = new Scanner(is)) {
            //Counter
            int i = 1;

            String input;
            //Read each line of file and print it out
            while (readStory.hasNextLine()) {
                input = readStory.nextLine();
                System.out.println(i + "." + input);
                i++;
            }
        } catch (Exception e) {
            System.err.println("ERROR! File was not found!");
        }
    }
}
