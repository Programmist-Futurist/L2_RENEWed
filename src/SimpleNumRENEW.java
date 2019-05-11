import java.util.Scanner;

public class SimpleNumRENEW {

    static class SimpleNumOrNot {

        int simpleNumOrNotFunction(int num, int determinant) {
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    determinant += 1;
                }
            }
            return determinant;
        }
    }

    static class DisplaySimpleOrNotSimple{
        void displaySimpleOrNotSimpleFunction (int d) {
            if (d == 0) {
                System.out.println("Simple!");
            } else {
                System.out.println("Not Simple!");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        int num = scaner.nextInt();
            int determinant = 0;
        SimpleNumOrNot simpleNumOrNot = new SimpleNumOrNot();
        determinant = simpleNumOrNot.simpleNumOrNotFunction(num, determinant);
        DisplaySimpleOrNotSimple displaySimpleOrNotSimple = new DisplaySimpleOrNotSimple();
        displaySimpleOrNotSimple.displaySimpleOrNotSimpleFunction(determinant);
        }
}

