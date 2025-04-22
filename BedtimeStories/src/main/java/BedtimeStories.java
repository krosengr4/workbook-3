import java.io.FileInputStream;
import java.util.Scanner;

public class BedtimeStories {

    public static void main(String[] args) {

        Scanner userPrompt = new Scanner(System.in);

        System.out.println("1: Goldilocks and the Three Bears \n 2: Hansel and Gretel \n 3: Mary had a Little Lamb.");
        System.out.println("\n Choose a number 1-3 to choose a bedtime story to read: ");
        int userInput = userPrompt.nextInt();

        switch (userInput) {
            case 1:
                readGoldilocks();
                break;
            case 2:
                readHanselAndGretel();
                break;
            case 3:
                readMaryHadLittleLamb();
                break;
            default:
                System.out.println("ERROR: Please choose a number between 1-3!");
        }
    }

    static void readGoldilocks() {
        FileInputStream fis = null;
        try{
            fis = new FileInputStream("/Users/rosen/pluralsight/workbook-3/BedtimeStories/src/main/resources/DataFiles/goldilocks.txt");

            Scanner readFile = new Scanner(fis);

            String input;
            int i =1;

            while (readFile.hasNextLine()) {
                input = readFile.nextLine();
                System.out.println(i + "." + input);
                i++;
            }
            readFile.close();
        } catch (Exception e) {
            System.out.println("ERROR! File was not found!");
        }

    }

    static void readHanselAndGretel() {
        FileInputStream fis = null;

        try {
            fis = new FileInputStream("/Users/rosen/pluralsight/workbook-3/BedtimeStories/src/main/resources/DataFiles/hansel_and_gretel.txt");

            Scanner readFile = new Scanner(fis);

            String input;
            int i = 1;

            while (readFile.hasNextLine()) {
                input = readFile.nextLine();
                System.out.println(i + "." + input);
                i++;
            }

            readFile.close();

        } catch (Exception e) {
            System.out.println("ERROR! File was not found!");
        }
    }

    static void readMaryHadLittleLamb() {
        FileInputStream fis = null;

        try {
            fis = new FileInputStream("/Users/rosen/pluralsight/workbook-3/BedtimeStories/src/main/resources/DataFiles/mary_had_a_little_lamb.txt");

            Scanner readFile = new Scanner(fis);

            String input;
            int i = 1;

            while (readFile.hasNextLine()) {
                input = readFile.nextLine();
                System.out.println(i + "." + input);
                i++;
            }

            readFile.close();

        } catch (Exception e) {
            System.out.println("ERROR! File was not found!");
        }
    }

}
