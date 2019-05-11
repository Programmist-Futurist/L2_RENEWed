import java.util.Arrays;

public class BigArrayRENEW {

    static class FillDeepArrayWithNumbers{
        int[][][][][][] fillDeepArrayWithNumbersFunction(int[][][][][][] array) {
            int[][][][][][] mas = array;
            int var = 1;
            for (int i = 0; i < mas.length; i++) {
                for (int j = 0; j < mas.length; j++) {
                    for (int q = 0; q < mas.length; q++) {
                        for (int k = 0; k < mas.length; k++) {
                            for (int h = 0; h < mas.length; h++) {
                                for (int g = 0; g < mas.length; g++) {
                                    mas[i][j][q][k][h][g] = var++;
                                }
                            }
                        }
                    }
                }
            }
            return mas;
        }
    }

    static class DisplayDeepArray{
        void displayDeepArrayFunction(int[][][][][][] array){
            System.out.println(Arrays.deepToString(array));
        }
    }


    public static void main(String[] args) {
        int[][][][][][] array = new int[2][2][2][2][2][2];
        int var = 1;
        DisplayDeepArray displayDeepArray = new DisplayDeepArray();
        FillDeepArrayWithNumbers fillDeepArrayWithNumbers = new FillDeepArrayWithNumbers();
        array = fillDeepArrayWithNumbers.fillDeepArrayWithNumbersFunction(array);
        displayDeepArray.displayDeepArrayFunction(array);

    }
}
