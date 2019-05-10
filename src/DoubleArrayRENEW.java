import java.util.Arrays;

public class DoubleArrayRENEW {

    static class DoubleArr {
        char[][] doubleFunc(char[][] array) {
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


    static class Output1 {
        void OutputFunc(char[][] array) {
            System.out.println(Arrays.deepToString(array));
        }
    }

    public static void main(String[] args) {
        final int H = 5;
        char[][] array = new char[H][H];
        DoubleArr doubleArr = new DoubleArr();
        Output1 output1 = new Output1();
        array = doubleArr.doubleFunc(array);
        output1.OutputFunc(array);
    }
}