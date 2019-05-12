import java.util.Arrays;

public class BigArrayRENEW {

    static class FillDeepArrayWithNumbers{
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

    static class DisplayDeepArray{
        void displayDeepArrayFunction(int[][][][][][] array){
            System.out.println(Arrays.deepToString(array));
        }
    }


    public static void main(String[] args) {
        int[][][][][][] deepArrayWithNumbers = new int[2][2][2][2][2][2];
        int var = 1;
        DisplayDeepArray displayDeepArray = new DisplayDeepArray();
        FillDeepArrayWithNumbers fillDeepArrayWithNumbers = new FillDeepArrayWithNumbers();
        deepArrayWithNumbers = fillDeepArrayWithNumbers.fillDeepArrayWithNumbersFunction(deepArrayWithNumbers);
        displayDeepArray.displayDeepArrayFunction(deepArrayWithNumbers);

    }
}
