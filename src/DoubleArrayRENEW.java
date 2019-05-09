import java.util.Arrays;

public class DoubleArrayRENEW {
    public static void main(String[] args) {
        final int H = 5;
        char[][] array = new char[H][H];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if(((i+j)%2)==0) {
                    array[i][j] = 'Ч';
                } else {
                    array[i][j] = 'Б';
                }
            }
        }
        System.out.println(Arrays.deepToString(array));
    }
}