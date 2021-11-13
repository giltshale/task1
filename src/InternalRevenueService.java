import java.util.Scanner;

public class InternalRevenueService {
    final static int SUNDAY = 1;
    final static int FRIDAY = 6;
    final static int SATURDAY = 7;
    final static int STARTING_HOUR_TUESDAY = 8;
    final static int STARTING_HOUR = 9;
    final static int ENDING_HOUR_TUESDAY = 12;
    final static int ENDING_HOUR = 17;
    final static int EARLIEST_TIME_OF_ARRIVAL = 0;
    final static int LATEST_TIME_OF_ARRIVAL = 23;

    public static void main(String[] args) {
        System.out.println("Please choose a day for your appointment (1-7):" + "\n"
                + "for sunday press    1" + "\n" + "for monday press    2" + "\n" + "for tuesday press   3" +
                "\n" + "for wednesday press 4" + "\n" +
                "for thursday press  5" + "\n" + "for friday press    6" + "\n" + "for saturday press  7");
        int arrivalDay;
        int earliestTime;
        int latestTime;
        Scanner scanner = new Scanner(System.in);
        arrivalDay = scanner.nextInt();
        if (SATURDAY < arrivalDay || arrivalDay < SUNDAY) {
            System.out.println("wrong day input");

        } else if (arrivalDay == SATURDAY || arrivalDay == FRIDAY) {
            System.out.println("We are closed at the weekend");
        } else {
            System.out.println("What is the earliest time you can arrive? ");
            earliestTime = scanner.nextInt();
            if (LATEST_TIME_OF_ARRIVAL > earliestTime && earliestTime > EARLIEST_TIME_OF_ARRIVAL) {
                System.out.println("What is the latest  time you can arrive? ");
                latestTime = scanner.nextInt();
                if ((latestTime < LATEST_TIME_OF_ARRIVAL)) {

                    if (earliestTime > latestTime) {
                        System.out.println("It not possible that earliest Time of arrival" + "\n" +
                                " is sooner then last time of arrival, try again please");

                    } else
                        switch (arrivalDay) {
                            case 1:
                            case 2:
                            case 4:
                            case 5:
                                if (STARTING_HOUR < earliestTime && latestTime <= ENDING_HOUR) {
                                    System.out.println("Your Appointment Has Been Set between " + earliestTime + " - " + latestTime);
                                    break;
                                } else {
                                    System.out.println("Our working hours on sunday,monday,wednesday,thursday is:" + "\n" + "9 - 17 ");
                                    break;
                                }
                            case 3:
                                if (STARTING_HOUR_TUESDAY <= earliestTime && latestTime <= ENDING_HOUR_TUESDAY) {
                                    System.out.println("Your Appointment Has Been Set between " + earliestTime + " - " + latestTime);
                                    break;
                                } else {
                                    System.out.println("Our working hours on tuesday is 8 - 12  ");
                                    break;
                                }

                            default:
                                System.out.println("You choose wrong time");
                                break;
                        }
                }
            } else
                System.out.println("You choose wrong time");
        }
    }
}
