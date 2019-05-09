import java.util.Scanner;

public abstract class CommonDividerRENEW {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        int a = scaner.nextInt();
        int b = scaner.nextInt();
            int c = 0;
        if (a > b) {
            while (b != 0) {
                c = b;
                b = a % b;
                a = c;
            }
        } else {
            c = 0;
            while (a != 0) {
                c = a;
                a = b % a;
                b = c;
            }
        }
        System.out.println(c);
    }
}
