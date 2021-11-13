import java.util.Scanner;

public class SqrEquation {
    final static int ZERO = 0;

    public static void main(String[] args) {
        System.out.println("Please enter 3 numbers for the equation: ");
        Scanner scanner = new Scanner(System.in);
        int firstNum = scanner.nextInt();
        int secondNum = scanner.nextInt();
        int thirdNum = scanner.nextInt();
        double delta = Math.pow(secondNum, 2) - 4 * firstNum * thirdNum;
        double deltaRoot = Math.sqrt(delta);
        double x1 = -secondNum + deltaRoot / 2 * firstNum;
        double x2 = -secondNum - deltaRoot / 2 * firstNum;
        if (delta < ZERO) {
            System.out.println("There is no solution for the equation");
        } else if (delta == ZERO) {
            System.out.println("There is 1 solution : x1=" + x1);
        } else {
            System.out.println("There are 2 solutions :x1=" + x1 + " x2=" + x2);
        }
    }
}

