import java.util.Scanner;

/**
 * In this class determines is some number Simple or not
 * And also displays the result
 */
public class SimpleNumRENEW {

    /**
     * Class have a method that determines Simple number or not
     */
    static class SimpleNumOrNot {
        /**
         * Method determines Simple number or not
         * @param someNumber
         * @return determinant that will show us simple number or not
         */
        int simpleNumOrNotFunction(int someNumber) {
            if (someNumber<0){
                try {
                    throw new IncorrectValueException("Must be natural number!");
                } catch (IncorrectValueException e) {
                    e.printStackTrace();
                }
            }

            int determinant = 0;
            for (int i = 2; i < someNumber; i++) {
                if (someNumber % i == 0) {
                    determinant += 1;
                }
            }
            return determinant;
        }
    }

    /**
     * Class contains method that displays the result "Simple" or "Not simple"
     */
    static class DisplaySimpleOrNotSimple{
        void displaySimpleOrNotSimpleFunction (int d) {
            if (d<0){
                try {
                    throw new IncorrectValueException("Must be natural number!");
                } catch (IncorrectValueException e) {
                    e.printStackTrace();
                }
            }

            if (d == 0) {
                System.out.println("Simple!");
            } else {
                System.out.println("Not Simple!");
            }
        }
    }

    /**
     * Starts the work of all methods of the class SimpleNumRENEW
     * @param args
     */
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        int someNumber = scaner.nextInt();
        SimpleNumOrNot simpleNumOrNot = new SimpleNumOrNot();
        int determinant = simpleNumOrNot.simpleNumOrNotFunction(someNumber);
        DisplaySimpleOrNotSimple displaySimpleOrNotSimple = new DisplaySimpleOrNotSimple();
        displaySimpleOrNotSimple.displaySimpleOrNotSimpleFunction(determinant);
        }
}

