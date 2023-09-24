import java.util.Scanner;
import java.util.Random;

public class CodSoft1 {

    public static void main(String args[]) {
        generateRandom();
    }

    public static void generateRandom() {
        Random rand = new Random();

        int randomNum = rand.nextInt(101);

        guess(randomNum);
    }

    public static void guess(int randomNum) {
        Scanner in = new Scanner(System.in);

        System.out.println("");
        System.out.println("Number Guessing Game");
        System.out.print("Guess a number between 0-100: ");
        int guess = in.nextInt();
        System.out.println("");

        // input validation
        while (guess < 0 || guess > 100) {
            System.out.print("Guess a number between 0-100: ");
            guess = in.nextInt();
            System.out.println("");
        }

        // try again until you guess the correct number
        int tries = 0;
        while (guess != randomNum) {

            if (guess > randomNum) {
                System.out.println("Too large!..");
            } else if (guess < randomNum) {
                System.out.println("Too small!..");
            }

            tries++;
            System.out.print("Guess again: ");
            guess = in.nextInt();
            System.out.println("");

            // input validation
            while (guess < 0 || guess > 100) {
                System.out.print("Guess a number between 0-100: ");
                guess = in.nextInt();
                System.out.println("");
            }
        }

        // Game Won
        System.out.println("Correct Answer. You Won!");
        System.out.println("Wrong Tries: " + tries);
        System.out.println("");

        // Play again or exit?
        System.out.println("Press 1 to Play again.");
        System.out.println("Press 0 to exit.");
        int choice = in.nextInt();

        if (choice == 1)
            generateRandom();
        else
            return;
    }

}