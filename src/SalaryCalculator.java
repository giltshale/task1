import java.util.Scanner;

public class SalaryCalculator {
    final static int SENIOR_HOURLY_PAY = 200;
    final static int NOT_SENIOR_HOURLY_PAY = 50;

    public static double monthlySalary(boolean isSeniorWorker, int monthlyHours, int bonusDays) {
        if (isSeniorWorker) {
            return monthlyHours * SENIOR_HOURLY_PAY + 250 * bonusDays;
        } else {
            return monthlyHours * NOT_SENIOR_HOURLY_PAY + 250 * bonusDays;
        }
    }

    public static void main(String[] args) {
        boolean isSeniorWorker;
        int monthlyHours;
        int bonusDays;
        while (true) {
            System.out.println("Hi,please enter your details, write true if you are a senior worker or false if not:");
            Scanner scanner = new Scanner(System.in);
            isSeniorWorker = scanner.nextBoolean();
            System.out.println("Now,please enter how many hours did you worked this month: ");
            monthlyHours = scanner.nextInt();
            System.out.println("At last, please enter how many days you reached the daily goal: ");
            bonusDays = scanner.nextInt();
            System.out.println("Your salary is: " + monthlySalary(isSeniorWorker, monthlyHours, bonusDays)
                    + " ILS " + "  Next worker please ");
        }
    }
}
