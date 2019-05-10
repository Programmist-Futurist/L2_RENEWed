import java.util.Scanner;

public class SumOfRowRENEW {
    static class FactorialSum{
        int factorialSumFanc(int num){
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
        FactorialSum factorialSum = new FactorialSum();
        int sum = factorialSum.factorialSumFanc(num);
        CommonDividerRENEW.Out1.out1Func(sum);
    }
}
