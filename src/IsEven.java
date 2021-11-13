import java.util.Scanner;

public class IsEven {
    public static void main(String[] args) {

        System.out.println("Please enter  two numbers");
        Scanner scanner = new Scanner(System.in);
        int firstNum = scanner.nextInt();
        int secondNum = scanner.nextInt();
        int sum = firstNum + secondNum;
        if (sum % 2 == 0) {
            System.out.println("The sum of " + firstNum + "+" + secondNum + " is Even");
        } else
            System.out.println("The sum of " + firstNum + "+" + secondNum + " is Odd");

    }
}