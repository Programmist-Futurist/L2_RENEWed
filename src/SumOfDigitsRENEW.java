import java.util.Scanner;

/**
 * In class calculates sum of digits of some number
 */
public class SumOfDigitsRENEW {

    /**
     * Class contains method that calculates sum of digits of certain number
     */
    static class DigitsSum{
        /**
         * Method calculates sum of digits of certain number
         * @param someNumber
         * @return sum of digits
         */
        int digitsSumFunc(int someNumber){
            int temp_sum = 0;
            while (someNumber > 0){
                temp_sum += someNumber % 10;
                someNumber /= 10;
            }
            return temp_sum;
        }
    }

    /**
     * Starts the work of all methods of the class SumOfDigitsRENEW
     * @param args
     */
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        int someNumber = scaner.nextInt();
        DigitsSum digitsSum = new DigitsSum();
        int sum_of_digits = digitsSum.digitsSumFunc(someNumber);
        CommonDividerRENEW.DisplayCommonDivider.displayCommonDividerFunction(sum_of_digits);
    }
}
