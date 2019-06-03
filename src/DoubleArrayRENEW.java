import java.util.Arrays;

/**
 * In this class (char[][] array) is fills with chars 'Ч' and 'Б' staggered
 * And also array displays
 */
public class DoubleArrayRENEW {

    /**
     * Class contains method that fills array with 2 chars 'Ч' and 'Б'
     */
    static class FillDoubleArrayWithChars {
        /**
         * Fills array with 2 chars 'Ч' and 'Б' staggered
         * @param array
         * @return array full of chars 'Ч' and 'Б' staggered
         */
        char[][] fillDoubleArrayWithCharsFunction(char[][] array) {
            if (array.length==0){
                try {
                    throw new IncorrectValueException("Length of array must be more than zero!");
                } catch (IncorrectValueException e) {
                    e.printStackTrace();
                }
            }

            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array.length; j++) {
                    if (((i + j) % 2) == 0) {
                        array[i][j] = 'Ч';
                    } else {
                        array[i][j] = 'Б';
                    }
                }
            }
            return array;
        }
    }


    /**
     * Class contains method that displays (char[][] array) in String format
     */
    static class DisplayDoubleArray {
        /**
         * This method displays (char[][] array) in String format
         * @param array
         */
        void displayDoubleArrayFunction(char[][] array) {
            System.out.println(Arrays.deepToString(array));
        }
    }

    /**
     * Starts the work of all methods of the class DoubleArrayRENEW
     * @param args
     */
    public static void main(String[] args) {
        final int ARRAY_SIZE = 5;
        char[][] DoubleArray = new char[ARRAY_SIZE][ARRAY_SIZE];
        FillDoubleArrayWithChars fillDoubleArrayWithChars = new FillDoubleArrayWithChars();
        DisplayDoubleArray displayDoubleArray = new DisplayDoubleArray();
        DoubleArray = fillDoubleArrayWithChars.fillDoubleArrayWithCharsFunction(DoubleArray);
        displayDoubleArray.displayDoubleArrayFunction(DoubleArray);
    }
}