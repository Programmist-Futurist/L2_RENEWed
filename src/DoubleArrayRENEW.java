import java.util.Arrays;

public class DoubleArrayRENEW {

    static class FillDoubleArrayWithChars {
        char[][] fillDoubleArrayWithCharsFunction(char[][] array) {
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


    static class DisplayDoubleArray {
        void displayDoubleArrayFunction(char[][] array) {
            System.out.println(Arrays.deepToString(array));
        }
    }

    public static void main(String[] args) {
        final int H = 5;
        char[][] DoubleArray = new char[H][H];
        FillDoubleArrayWithChars fillDoubleArrayWithChars = new FillDoubleArrayWithChars();
        DisplayDoubleArray displayDoubleArray = new DisplayDoubleArray();
        DoubleArray = fillDoubleArrayWithChars.fillDoubleArrayWithCharsFunction(DoubleArray);
        displayDoubleArray.displayDoubleArrayFunction(DoubleArray);
    }
}