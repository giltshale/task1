import java.util.Scanner;

public class PrintingStars {
    final static int MINIMUM_NUMBER_OF_STARS = 5;
    final static int MAXIMUM_NUMBER_OF_STARS = 20;

    public static int userNumber() {
        int ScannedNumber;
        do {
            System.out.println("Please enter a number from 5 to 20 (including): ");
            Scanner scanner = new Scanner(System.in);
            ScannedNumber = scanner.nextInt();
        } while (MINIMUM_NUMBER_OF_STARS > ScannedNumber || ScannedNumber > MAXIMUM_NUMBER_OF_STARS);
        return ScannedNumber;
    }

    public static void starsPrint(int sizeOfStars) {
        int i, j;
        for (i = 0; i < sizeOfStars; i++) {
            for (j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int numberInTheRange = userNumber();
        starsPrint(numberInTheRange);
    }
}
