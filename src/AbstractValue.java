import java.util.Scanner;
public class AbstractValue {
    public static void main(String[] arg) {
        System.out.println("Please Enter Number ");
        Scanner scanner = new Scanner(System.in);
        int userNumber = scanner.nextInt();
        if (userNumber < 0) {
            userNumber = userNumber * -1;
        }
        System.out.println("The abstract value of your number is " + userNumber);
    }
}
