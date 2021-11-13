import java.util.Scanner;


public class PrintByOrder {
    public static void main(String[] args) {
        System.out.println("Please enter 3 numbers");
        Scanner scanner = new Scanner(System.in);
        int firstScannedNumber, secondScannedNumber, thirdScannedNumber;
        firstScannedNumber = scanner.nextInt();
        secondScannedNumber = scanner.nextInt();
        thirdScannedNumber = scanner.nextInt();
        int biggest = 0;
        int secondBiggest = 0;
        int lastNum = 0;
        if (firstScannedNumber > secondScannedNumber && firstScannedNumber>thirdScannedNumber) {
            biggest = firstScannedNumber;
            if (thirdScannedNumber > secondScannedNumber) {
                secondBiggest = thirdScannedNumber;
                lastNum = secondScannedNumber;
            } else {
                secondBiggest = secondScannedNumber;
                lastNum = thirdScannedNumber;
            }
        } else if (secondScannedNumber > firstScannedNumber && secondScannedNumber>thirdScannedNumber) {
            biggest = secondScannedNumber;
            if (firstScannedNumber > thirdScannedNumber) {
                secondBiggest = firstScannedNumber;
                lastNum = thirdScannedNumber;
            } else {
                secondBiggest = thirdScannedNumber;
                lastNum = firstScannedNumber;
            }
        } else if (thirdScannedNumber > firstScannedNumber && thirdScannedNumber > secondScannedNumber) {
            biggest = thirdScannedNumber;
            if (firstScannedNumber > secondScannedNumber) {
                secondBiggest = firstScannedNumber;
                lastNum = secondScannedNumber;
            } else {
                secondBiggest = secondScannedNumber;
                lastNum = firstScannedNumber;
            }
        }
        System.out.println("The order of numbers is " + biggest + " "+ secondBiggest + " " + " " + lastNum);
    }
}
