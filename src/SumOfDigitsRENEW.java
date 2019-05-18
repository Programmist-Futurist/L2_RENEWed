import java.util.Scanner;

public class SumOfDigitsRENEW {

    static class DigitsSum{
        int digitsSumFunc(int someNumber){
            int temp_sum = 0;
            while (someNumber > 0){
                temp_sum += someNumber % 10;
                someNumber /= 10;
            }
            return temp_sum;
        }
    }
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        int someNumber = scaner.nextInt();
        DigitsSum digitsSum = new DigitsSum();
        int sum_of_digits = digitsSum.digitsSumFunc(someNumber);
        CommonDividerRENEW.DisplayCommonDivider.displayCommonDividerFunction(sum_of_digits);
    }
}
