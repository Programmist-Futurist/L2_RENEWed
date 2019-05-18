import java.util.Scanner;

public abstract class CommonDividerRENEW {

    static class FindCommonDivider {
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
