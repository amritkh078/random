import java.util.Scanner;

public class Main {
    public static void numberGuess() {

        // scanner
        Scanner sc = new Scanner(System.in);

        // generate random  number
        int num = 1+(int)(100*Math.random());

        // n trials
        int n = 10;

        int i, guess;

        System.out.println( "A number is chosen" + " between 1 to 100."
                + "Guess the number" + " within 10 trials.");
        // iterate over n trials
        for (i=0; i<n; i++){
            System.out.print("Guess the number:");
            guess = sc.nextInt();

            // If the number is guessed
            if (num == guess) {
                System.out.println("Congratulations!" + " You guessed the number.");
                break;
            }
            else if (num > guess
                    && i != n - 1) {
                System.out.println("The number is " + "greater than " + guess);
            }
            else if (num < guess
                    && i != n - 1) {
                System.out.println("The number is" + " less than " + guess);
            }
        }
        if (i == n) {
            System.out.println("You have exhausted" + " 10 trials.");

            System.out.println("The number was " + num);
        }
    }
    // Driver Code
    public static void
    main(String[] arg)
    {
        // Function Call
        numberGuess();
    }
}