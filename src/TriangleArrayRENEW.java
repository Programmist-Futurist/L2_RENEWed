public class TriangleArrayRENEW {

    static class TriangleClass{
        void triangleFunc(int[][] array){
            OutArray1 outArray1 = new OutArray1();
            OutArray2 outArray2 = new OutArray2();

            for (int i = 1; i < array.length; i++) {
                for (int j = 0; j < array.length; j++) {
                    int temp1 = 1;
                    int temp2 = 1;
                    int temp3 = 1;
                    for (int q = 1; q <= i; q++) {
                        temp1 *= q;
                    }
                    for (int k = 1; k <= j; k++) {
                        temp2 *= k;
                    }
                    for (int u = 1; u <= (i - j); u++) {
                        temp3 *= u;
                    }
                    int c = temp1 / (temp2 * temp3);
                    array[i][j] = c;

                    if(array[i][j] != 0) {
                        int m = 10;
                        outArray1.outArrayFunc(array, i, j);
                    }
                }
                outArray2.outArrayFunc();
            }
        }
    }

    static class OutArray1{
        void  outArrayFunc(int[][] array, int i, int j){
            System.out.print(array[i][j] + " ");
        }
    }


    static class OutArray2{
        void  outArrayFunc(){
            System.out.println();
        }
    }
    public static void main(String[] args) {
        final int K = 10;
        int[][] array = new int[K][K];
        array[0][0] = 1;
        CommonDividerRENEW.Out1.out1Func(array[0][0]);
        TriangleClass triangleClass = new TriangleClass();
        triangleClass.triangleFunc(array);
    }
}
// Получилось только такой вывод сделать,
// у меня был вариант как сделать красивый вывод треугольника,
// но код очень объемный получался и не красивый, так что только так,
// И код упростить не получилось, без понятия как это сделать...