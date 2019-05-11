import java.util.Scanner;

public abstract class CommonDividerRENEW {

    static class FindCommonDivider {
        int findCommonDividerFunction(int a, int b) {
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

     static class DisplayCommonDivider{
        static void displayCommonDividerFunction(int c) {
            System.out.println(c);
        }
    }


    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        int firstNum = scaner.nextInt();
        int secondNum = scaner.nextInt();
        FindCommonDivider findCommonDivider = new FindCommonDivider();
        DisplayCommonDivider displayCommonDivider = new DisplayCommonDivider();
        int commonDivider = findCommonDivider.findCommonDividerFunction(firstNum, secondNum);
        displayCommonDivider.displayCommonDividerFunction(commonDivider);


    }

}
