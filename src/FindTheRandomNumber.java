import java.util.Random;
import java.util.Scanner;

public class FindTheRandomNumber {
    public static void main(String[] args) {
        int howManyAttempt = 0;
        boolean firstPlayerTurn = true;
        int playerGuess, randomNumber;
        Random randomGenerator = new Random();
        randomNumber = randomGenerator.nextInt(1000) + 1; // random number in range of 1 -1000
        do {
            Scanner scanner = new Scanner(System.in);
            if (firstPlayerTurn
            )
                System.out.println(" Player 1 - Please guess the random number between 1-1000 ");
            else {
                System.out.println(" Player 2 - Please guess the random number between 1-1000 ");
            }
            playerGuess = scanner.nextInt();
            if (randomNumber > playerGuess) {
                System.out.println("Your guess is LOWER then the random number ");
                howManyAttempt++;
                firstPlayerTurn = !firstPlayerTurn;
            } else if (randomNumber < playerGuess) {
                System.out.println("Your guess is HIGHER then the random number ");
                howManyAttempt++;
                firstPlayerTurn = !firstPlayerTurn;
            } else if (!firstPlayerTurn)
                System.out.println("Player 2 wins after " + ++howManyAttempt + " attempts");
            else System.out.println("Player 1 wins after " + ++howManyAttempt + " attempts ");

        }
        while (randomNumber != playerGuess);
    }
}
