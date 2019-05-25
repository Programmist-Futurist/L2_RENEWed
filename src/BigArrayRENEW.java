import java.util.Arrays;

/**
 * In this class array  fills with natural Numbers
 */
public class BigArrayRENEW {

    /**
     * Tis class contains method that fills deep array with natural numbers
     */
    static class FillDeepArrayWithNumbers{
        /**
         * This method fills deep array with natural numbers
         * @param array
         * @return array that full of natural numbers
         */
        int[][][][][][] fillDeepArrayWithNumbersFunction(int[][][][][][] array) {
            int var = 1;
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array.length; j++) {
                    for (int q = 0; q < array.length; q++) {
                        for (int k = 0; k < array.length; k++) {
                            for (int h = 0; h < array.length; h++) {
                                for (int g = 0; g < array.length; g++) {
                                    array[i][j][q][k][h][g] = var++;
                                }
                            }
                        }
                    }
                }
            }
            return array;
        }
    }

    /**
     * Contains the method that displays some int[][][][][][] array
     */
    static class DisplayDeepArray{
        /**
         * This method displays some int[][][][][][] array
         * @param array
         */
        void displayDeepArrayFunction(int[][][][][][] array){
            System.out.println(Arrays.deepToString(array));
        }
    }


    /**
     * Starts the work of all methods of the class BigArrayRENEW
     * @param args
     */
    public static void main(String[] args) {
        int[][][][][][] deepArrayWithNumbers = new int[2][2][2][2][2][2];
        int var = 1;
        DisplayDeepArray displayDeepArray = new DisplayDeepArray();
        FillDeepArrayWithNumbers fillDeepArrayWithNumbers = new FillDeepArrayWithNumbers();
        deepArrayWithNumbers = fillDeepArrayWithNumbers.fillDeepArrayWithNumbersFunction(deepArrayWithNumbers);
        displayDeepArray.displayDeepArrayFunction(deepArrayWithNumbers);

    }
}
