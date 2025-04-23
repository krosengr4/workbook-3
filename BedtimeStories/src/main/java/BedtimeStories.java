import java.io.InputStream;
import java.util.Scanner;

public class BedtimeStories {

    public static void main(String[] args) {

        int i;
        String[][] books = {
                {
                        "Goldilocks and the three bears",
                        "Hansel and Gretel",
                        "Mary had a little lamb"
                },
                {
                        "/goldilocks.txt",
                        "/hansel_and_gretel.txt",
                        "/mary_had_a_little_lamb.txt"
                }
        };

        Scanner userPrompt = new Scanner(System.in);

        for (i = 0; i < books[0].length; ++i) {
            System.out.println((i + 1) + ": " + books[0][i]);
        }
        System.out.println("\n Choose a number 1 - " + books[1].length + " to choose a bedtime story to read: ");
        int userInput = userPrompt.nextInt();

        if(userInput > 0 && userInput <= books[1].length){
            readStory(books[1][userInput-1]);
        } else {
            System.err.println("ERROR: User input out of bounds!");
        }

    }

    // Method to print out story
    static void readStory(String fileName) {

        InputStream is = BedtimeStories.class.getResourceAsStream(fileName);

        try (Scanner readStory = new Scanner(is)) {

            String input;
            int i = 1;

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
