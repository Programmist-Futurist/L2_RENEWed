import java.util.Scanner;

public class SimpleNumRENEW {

    static class SimpleNumOrNot {

        int simpleNumOrNotFunction(int someNumber, int determinant) {
            for (int i = 2; i < someNumber; i++) {
                if (someNumber % i == 0) {
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
        int someNumber = scaner.nextInt();
            int determinant = 0;
        SimpleNumOrNot simpleNumOrNot = new SimpleNumOrNot();
        determinant = simpleNumOrNot.simpleNumOrNotFunction(someNumber, determinant);
        DisplaySimpleOrNotSimple displaySimpleOrNotSimple = new DisplaySimpleOrNotSimple();
        displaySimpleOrNotSimple.displaySimpleOrNotSimpleFunction(determinant);
        }
}

