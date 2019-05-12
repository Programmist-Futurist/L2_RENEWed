public class TriangleArrayRENEW {



         static class FillTriangleArrayWithNumbers {
            int[][] fillTriangleArrayWithNumbersFunction() {
                int[][] TriangleArray = new int[10][10];
                for (int i = 0; i < 10; i++) {
                    TriangleArray[i][0] = 1;
                    TriangleArray[i][i] = 1;
                    for (int j = 1; j < i; j++) {
                        TriangleArray[i][j] = TriangleArray[i - 1][j - 1] + TriangleArray[i - 1][j];
                    }
                }
                return TriangleArray;
            }
        }


    static class OutTriangleArray {
        public void show () {
            int[][] TempTriangleArray = new int[10][10];

            FillTriangleArrayWithNumbers fillTriangleArrayWithNumbers = new FillTriangleArrayWithNumbers();
            TempTriangleArray = fillTriangleArrayWithNumbers.fillTriangleArrayWithNumbersFunction();
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j <= i; j++) {
                    System.out.print(TempTriangleArray[i][j] + " ");
                }
                System.out.println();
            }
        }
    }


    public static void main(String[] args){
        FillTriangleArrayWithNumbers fillTriangleArrayWithNumbers = new FillTriangleArrayWithNumbers();
        OutTriangleArray outTriangleArray = new OutTriangleArray();
        outTriangleArray.show();
    }
}





















//    static class FillTriangleArrayWithSpecialNumbers {
//
//
//        int fillTriangleArrayWithSpecialNumbersFunction(int[][] triangle_array) {
//            DisplayRowOfTriangleArray displayRowOfTriangleArray = new DisplayRowOfTriangleArray();
//            JumpToNextRow jumpToNextRow = new JumpToNextRow();
//            for (int i = 1; i < triangle_array.length; i++) {
//                for (int j = 0; j < triangle_array.length; j++) {
//                    int temp1 = 1;
//                    int temp2 = 1;
//                    int temp3 = 1;
//                    for (int q = 1; q <= i; q++) {
//                        temp1 *= q;
//                    }
//                    for (int k = 1; k <= j; k++) {
//                        temp2 *= k;
//                    }
//                    for (int u = 1; u <= (i - j); u++) {
//                        temp3 *= u;
//                    }
//                    int calculation = temp1 / (temp2 * temp3);
//                    triangle_array[i][j] = calculation;
//
//                    if (triangle_array[i][j] != 0) {
//                        int m = 10;
//                        displayRowOfTriangleArray.displayRowOfTriangleArrayFunction(triangle_array, i, j);
//                    }
//                }
//                jumpToNextRow.jumpToNextRowFunction();
//            }
//        }
//    }
//
//
//    static class DisplayRowOfTriangleArray {
//        void displayRowOfTriangleArrayFunction(int[][] array, int i, int j) {
//            System.out.print(array[i][j] + " ");
//        }
//    }
//
//
//    static class JumpToNextRow {
//        void jumpToNextRowFunction() {
//            System.out.println();
//        }
//    }
//
//    public static void main(String[] args) {
//        final int K = 10;
//        int[][] TriangleArray = new int[K][K];
//        TriangleArray[0][0] = 1;
//        CommonDividerRENEW.DisplayCommonDivider.displayCommonDividerFunction(TriangleArray[0][0]);
//        FillTriangleArrayWithSpecialNumbers fillTriangleArrayWithSpecialNumbers = new FillTriangleArrayWithSpecialNumbers();
//        fillTriangleArrayWithSpecialNumbers.fillTriangleArrayWithSpecialNumbersFunction(TriangleArray);
//    }
//}
// Получилось только такой вывод сделать,
// у меня был вариант как сделать красивый вывод треугольника,
// но код очень объемный получался и не красивый, так что только так,
// И код упростить не получилось, без понятия как это сделать...