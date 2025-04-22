import java.io.InputStream;
import java.util.Scanner;

public class BedtimeStories {

    public static void main(String[] args) {

        Scanner userPrompt = new Scanner(System.in);

        // ask user to choose one of the three stories
        System.out.println("1: Goldilocks and the Three Bears \n 2: Hansel and Gretel \n 3: Mary had a Little Lamb.");
        System.out.println("\n Choose a number 1-3 to choose a bedtime story to read: ");
        int userInput = userPrompt.nextInt();

        // switch case to handle user input
        switch (userInput) {
            case 1:
                readStory("/DataFiles/goldilocks.txt");
                break;
            case 2:
                readStory("/DataFiles/hansel_and_gretel.txt");
                break;
            case 3:
                readStory("/DataFiles/mary_had_a_little_lamb.txt");
                break;
            default:
                System.err.println("ERROR: Please choose a number between 1-3!");
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
