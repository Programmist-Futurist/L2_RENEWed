import java.util.Scanner;

public class SumOfRowRENEW {
    static class SumOfFactorials{
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
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        int someNumber = scaner.nextInt();
        SumOfFactorials sumOfFactorials = new SumOfFactorials();
        int sum_of_factorials = sumOfFactorials.sumOfFactorialsFunction(someNumber);
        CommonDividerRENEW.DisplayCommonDivider.displayCommonDividerFunction(sum_of_factorials);
    }
}
