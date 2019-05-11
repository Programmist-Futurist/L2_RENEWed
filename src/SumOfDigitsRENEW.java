import java.util.Scanner;

public class SumOfDigitsRENEW {

    static class DigitsSum{
        int digitsSumFunc(int num){
            int sum = 0;
            while (num > 0){
                sum += num % 10;
                num /= 10;
            }
            return sum;
        }
    }
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        int num = scaner.nextInt();
        DigitsSum digitsSum = new DigitsSum();
        int sum = digitsSum.digitsSumFunc(num);
        CommonDividerRENEW.DisplayCommonDivider.displayCommonDividerFunction(sum);
    }
}
