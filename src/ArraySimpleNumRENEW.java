import java.util.Arrays;

public class ArraySimpleNumRENEW {
    public static void main(String[] args) {
        final int CONST = 100;
        int[] array = new int[CONST];
        int num=1;

        for (int i=0; i<CONST; i++) {
            int det = -2;
            while (det != num-2) {
                det=0;
                num++;
                for (int j = 2; j < num; j++) {
                    if (num % j != 0) {
                        det += 1;
                    }
                }
            }
            array[i] = num;
        }
        System.out.println(Arrays.toString(array));
    }
}
