import java.util.Scanner;

public class SumOfDigitsRENEW {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        int num = scaner.nextInt();
        int sum=0;
        while (num > 0){
            sum += num % 10;
            num /= 10;
        }
        System.out.println(sum);
    }
}
