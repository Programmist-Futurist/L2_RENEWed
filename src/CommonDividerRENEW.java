import java.util.Scanner;

public abstract class CommonDividerRENEW {

    static class IfElse1 {
        int commonDivider(int a, int b) {
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
            return c;
        }
    }

     static class Out1{
        static void out1Func(int c) {
            System.out.println(c);
        }
    }


    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        int a = scaner.nextInt();
        int b = scaner.nextInt();
        IfElse1 ifElse1 = new IfElse1();
        Out1 out1 = new Out1();
        int c = ifElse1.commonDivider(a, b);
        out1.out1Func(c);


    }

}
