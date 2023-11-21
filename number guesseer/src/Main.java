import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean playAgain = true;
        int totalAttempts = 0;
        int roundsWon = 0;

        // for multiple rounds
        while (playAgain) {
            // random number generates for each round
            int generatedNumber = random.nextInt(100) + 1;
            int attempts = 0;
            boolean guessedCorrectly = false;

            System.out.println("Guess the number between 1 and 100. You have 5 attempts.");

            while (attempts < 7) {
                System.out.print("Attempt " + (attempts + 1) + ": ");
                int userGuess = scanner.nextInt();
                attempts++;

                if (userGuess < generatedNumber) {
                    System.out.println("Too low! Try again.");
                } else if (userGuess > generatedNumber) {
                    System.out.println("Too high! Try again.");
                } else {
                    System.out.println("Congratulations! You guessed the correct number!");
                    guessedCorrectly = true;
                    break;
                }
            }

            if (guessedCorrectly) {
                roundsWon++;
            }

            totalAttempts += attempts;

            System.out.println("Round over. The number was: " + generatedNumber);
            System.out.println("Rounds won: " + roundsWon);
            System.out.println("Total attempts: " + totalAttempts);

            System.out.print("Do you want to play again? (yes/no): ");
            String playChoice = scanner.next().toLowerCase();

            if (!playChoice.equals("yes")) {
                playAgain = false;
            }
        }

        System.out.println("Game over. Thanks for playing!");
        scanner.close();
    }
}
