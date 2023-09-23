import java.util.Random;
import java.util.Scanner;

public class CodingKombat {
    public static void main(String[] args) {
        // Welcomes Users to the game of Koding Kombat
        System.out.println("Welcome to Koding Kombat");

        // Scanner to use for user input
        Scanner userInput = new Scanner(System.in);

        //Prompts user for an input adn then will allow user to put in a fighter
        System.out.print("Enter Fighter One: ");
        String userNameOne = userInput.nextLine();

        //Prompts user for an input adn then will allow user to put in a fighter
        System.out.print("Enter Fighter Two: ");
        String userNameTwo = userInput.nextLine();

        // Check if user input is "Chuck Norris" (case-insensitive)
        if ("Chuck Norris".equalsIgnoreCase(userNameOne)) {
            System.out.println("Chuck Norris always wins!");
        } else {
            // Generate random values for Fighter One and Fighter Two
            Random random = new Random();
            int fighterOneValue = random.nextInt(10) + 1; // Generates a random number between 1 and 10
            int fighterTwoValue = random.nextInt(10) + 1; // Generates a random number between 1 and 10

            //Prints out values for the fighters
            System.out.println(userNameOne + " has a value of " + fighterOneValue);
            System.out.println(userNameTwo + " has a value of " + fighterTwoValue);

            // Compare the values to determine the winner
            if (fighterOneValue > fighterTwoValue) {
                System.out.println(userNameOne + " wins the fight!");
            } else if (fighterTwoValue > fighterOneValue) {
                System.out.println(userNameTwo + " wins the fight!");
            } else {
                System.out.println("It's a tie!");
            }
        }
    }
}
