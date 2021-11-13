import java.util.Scanner;

public class PrimeNumbers {
    static boolean isDividing(int firstNumber, int secondNumber) {
        if (secondNumber == 0) {
            System.out.println("It is not possible dividing by zero");
        } else if (firstNumber < secondNumber)
            return false;
        return firstNumber % secondNumber == 0;
    }

    static boolean isPrimeNumber(int receivedNumber) {

        if (receivedNumber <= 1)
            return false;
        else
            for (int i = 2; i < receivedNumber; i++)
                if (isDividing(receivedNumber, i))
                    return false;
        return true;
    }

    public static int evenNumber() {
        int receivedNumber;
        do {
            System.out.println("Please enter an even number");
            Scanner scanner = new Scanner(System.in);
            receivedNumber = scanner.nextInt();
        } while (receivedNumber % 2 != 0);
        return receivedNumber;
    }

    public static void main(String[] args) {
        int userEvenNumber = evenNumber();
        for (int i = 2; i <= userEvenNumber; i++) {
            if (isPrimeNumber(i)) {
                System.out.println(i);
            }
        }
    }
}