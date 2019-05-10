import java.util.Arrays;

public class ArraySimpleNumRENEW {

    static class SimpleArr{
        int[] masFill(int CONST, int num) {
            int[] mas = new int[CONST];

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
                mas[i] = num;
            }
            return mas;
        }
    }

    static class ArrOut{
        static void arrayOut(int[] array) {
            System.out.println(Arrays.toString(array));
        }
    }
    public static void main(String[] args) {
        final int CONST = 100;
        int[] array = new int[CONST];
        int num=1;
        SimpleArr simpleArr = new SimpleArr();
        ArrOut arrOut = new ArrOut();
        array = simpleArr.masFill(CONST, num);
        arrOut.arrayOut(array);

    }
}
