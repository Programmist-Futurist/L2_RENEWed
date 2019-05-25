import java.util.Scanner;

/**
 * In this class calculates sum of factorials
 * of each num from factorial of some number
 */
public class SumOfRowRENEW {
    /**
     * Class contains method that calculates sum of factorials
     * of each num from factorial of certain number
     */
    static class SumOfFactorials{
        /**
         * Method calculates sum of factorials
         * of each num from factorial of certain number
         * @param someNumber
         * @return sum of factorials
         */
        int sumOfFactorialsFunction(int someNumber){
            int temp = 1;
            int temp_sum = 0;
            for(int i = 1; i <= someNumber; i++){
                temp = temp*i;
                temp_sum += temp;
            }
            return temp_sum;
        }
    }

    /**
     * Starts the work of all methods of the class SumOfRowRENEW
     * @param args
     */
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        int someNumber = scaner.nextInt();
        SumOfFactorials sumOfFactorials = new SumOfFactorials();
        int sum_of_factorials = sumOfFactorials.sumOfFactorialsFunction(someNumber);
        CommonDividerRENEW.DisplayCommonDivider.displayCommonDividerFunction(sum_of_factorials);
    }
}
