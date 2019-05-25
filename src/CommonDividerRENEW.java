import java.util.Scanner;

/**
 * In this class is possible to find common divider of 2 numbers
 */
public abstract class CommonDividerRENEW {

    /**
     * This class contains method that is finding common divider of 2 numbers
     */
    static class FindCommonDivider {
        /**
         * This method is finding common divider of 2 numbers
         * @param firstNum
         * @param secondNum
         * @return common divider (int)
         */
        int findCommonDividerFunction(int firstNum, int secondNum) {
            int temp = 0;
            if (firstNum > secondNum) {
                while (secondNum != 0) {
                    temp = secondNum;
                    secondNum = firstNum % secondNum;
                    firstNum = temp;
                }
            } else {
                temp = 0;
                while (firstNum != 0) {
                    temp = firstNum;
                    firstNum = secondNum % firstNum;
                    secondNum = temp;
                }
            }
            return temp;
        }
    }

    /**
     * Contains the method that displays some variable
     */
     static class DisplayCommonDivider{
        /**
         * Displays any variable
         * @param c
         */
        static void displayCommonDividerFunction(int c) {
            System.out.println(c);
        }
    }


    /**
     * Starts the work of all methods of the class CommonDividerRENEW
     * @param args
     */
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
