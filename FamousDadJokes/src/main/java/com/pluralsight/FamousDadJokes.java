package com.pluralsight;

import java.util.Scanner;

public class FamousDadJokes {

    public static void main(String[] args) {

        //Create an array with dad jokes
        String[] dadJokes = {
                "What do you call a magician who lost his magic? \n Ian. ",
                "How do computers get drunk? \n They take screenshots. ",
                "Why don't eggs tell each other jokes? \n Because they'd crack each other up. ",
                "I only know 26 letters of the alphabet. \n I don't know y. ",
                "Why can't your nose be 12 inches long? \n Because then it would be a foot! ",
                "I am reading a book on anti-gravity. \n It is impossible to put down. ",
                "I told my wife she was drawing on her eye brows too high. \n She looked surprised. ",
                "Why do cows where bells? \n Because their horns don't work. ",
                "How does a penguin build its house? \n Igloos it together. ",
                "Why don't skeletons fight each other? \n They don't have the guts."
        };

        //Open scanner
        Scanner myScanner = new Scanner(System.in);

        try {
            //User choice determine wether to stay in loop or exit app
            String userChoice = "y";

            //While loop to prompt user to hear more dad jokes
            while (userChoice.equalsIgnoreCase("y")) {
                //Get user input
                System.out.println("Choose a number from 1-10 for a dad joke: ");
                int jokeNumber = myScanner.nextInt();

                //Switch case to determine which joke to print out
                switch (jokeNumber) {
                    case 1:
                        System.out.println(dadJokes[0]);
                        break;
                    case 2:
                        System.out.println(dadJokes[1]);
                        break;
                    case 3:
                        System.out.println(dadJokes[2]);
                        break;
                    case 4:
                        System.out.println(dadJokes[3]);
                        break;
                    case 5:
                        System.out.println(dadJokes[4]);
                        break;
                    case 6:
                        System.out.println(dadJokes[5]);
                        break;
                    case 7:
                        System.out.println(dadJokes[6]);
                        break;
                    case 8:
                        System.out.println(dadJokes[7]);
                        break;
                    case 9:
                        System.out.println(dadJokes[8]);
                        break;
                    case 10:
                        System.out.println(dadJokes[9]);
                        break;
                    default:
                        System.out.println("ERROR! Must print a number between 1-10");
                }

                //Get user input if they want to hear another joke
                System.out.println("\n Would you like to hear another joke? (enter y or n): ");
                userChoice = myScanner.next();

                //If user selects n, exit the app
                if (userChoice.equalsIgnoreCase("n")) {
                    System.out.println("Exiting Famous Dad Jokes application. \nThank you!");
                    break;
                }
            }
        } catch (Exception e) {
            System.err.println("ERROR!");
        }
    }
}
