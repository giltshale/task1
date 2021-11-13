import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArithmeticProgression {

    /*
     * Class that use function that receives 3 inputs ,first number,
     * series differences and series size
     * and prints with printTheArithmeticProgression function the whole Arithmetic Progression
     *
     * * */
    public static void printTheArithmeticProgression(double firstValue, double differences, int seriesSize) {
        double sum;
        List<Double> progression = new ArrayList<>();
        for (int i = 1; i <= seriesSize; i++) {
            sum = firstValue + (i - 1) * differences;
            progression.add(sum);
        }
        for (Double i : progression) {
            System.out.println(i);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        double firstSeriesNumber, seriesDifferences;
        int seriesSize;
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please enter 3 numbers by this order: firstSeriesNumber seriesDifferences seriesSize (integer) ");
        firstSeriesNumber = userInput.nextDouble();
        seriesDifferences = userInput.nextDouble();
        seriesSize = Math.abs(userInput.nextInt());
        printTheArithmeticProgression(firstSeriesNumber, seriesDifferences, seriesSize);
    }

}
