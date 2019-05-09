import java.util.Scanner;

public class SumOfRowRENEW {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        int num = scaner.nextInt();
        int sum=0;
        int temp = 1;
        for(int i = 1; i <= num; i++){
            temp = temp*i;
            sum += temp;
        }
        System.out.println(sum);
    }
}
