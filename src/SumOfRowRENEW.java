import java.util.Scanner;

public class SumOfRowRENEW {
    static class SumOfFactorials{
        int sumOfFactorialsFunction(int num){
            int temp = 1;
            int sum = 0;
            for(int i = 1; i <= num; i++){
                temp = temp*i;
                sum += temp;
            }
            return sum;
        }
    }
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        int num = scaner.nextInt();
        SumOfFactorials sumOfFactorials = new SumOfFactorials();
        int sum = sumOfFactorials.sumOfFactorialsFunction(num);
        CommonDividerRENEW.DisplayCommonDivider.displayCommonDividerFunction(sum);
    }
}
