import java.util.Arrays;

public class ArraySimpleNumRENEW {

    static class FillArrayWithSimpleNumbers{
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

    static class DisplayArrayOut{
        static void displayArrayOutFunction(int[] array) {
            System.out.println(Arrays.toString(array));
        }
    }
    public static void main(String[] args) {
        final int CONST = 100;
        int[] ArrayWithSimpleNumbers = new int[CONST];
        FillArrayWithSimpleNumbers fillArrayWithSimpleNumbers = new FillArrayWithSimpleNumbers();
        DisplayArrayOut displayArrayOut = new DisplayArrayOut();
        ArrayWithSimpleNumbers = fillArrayWithSimpleNumbers.fillArrayWithSimpleNumbersFunction(CONST);
        displayArrayOut.displayArrayOutFunction(ArrayWithSimpleNumbers);
    }
}
