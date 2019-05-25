import java.util.Arrays;

/**
 * In this class array fills with Simple numbers
 * Then array displays
 */
public class ArraySimpleNumRENEW {

    /**
     * In this class array fills with Simple numbers
     */
    static class FillArrayWithSimpleNumbers{
        /**
         * fills array with simple numbers from 1 to ...
         * @param CONST
         * @return this array full of Simple numbers
         */
        int[] fillArrayWithSimpleNumbersFunction(int CONST) {
            int[] array = new int[CONST];
            int num = 1;
            for (int i=0; i<CONST; i++) {
                int det = -2;
                while (det != num-2) {
                    det=0;
                    num++;
                    for (int j = 2; j < num; j++) {
                        if (num % j != 0) {
                            det += 1; }
                    }
                }
                array[i] = num;
            }
            return array;
        }
    }

    /**
     * Contains the method that displays some int[] array
     */
    static class DisplayArrayOut{
        /**
         * Displays array in String format
         * @param array the array to display
         */
        static void displayArrayOutFunction(int[] array) {
            System.out.println(Arrays.toString(array));
        }
    }

    /**
     * Starts the work of all methods of the class ArraySimpleNumRENEW
     * @param args
     */
    public static void main(String[] args) {
        final int CONST = 100;
        int[] ArrayWithSimpleNumbers = new int[CONST];
        FillArrayWithSimpleNumbers fillArrayWithSimpleNumbers = new FillArrayWithSimpleNumbers();
        DisplayArrayOut displayArrayOut = new DisplayArrayOut();
        ArrayWithSimpleNumbers = fillArrayWithSimpleNumbers.fillArrayWithSimpleNumbersFunction(CONST);
        displayArrayOut.displayArrayOutFunction(ArrayWithSimpleNumbers);
    }
}
