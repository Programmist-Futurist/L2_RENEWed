public class TriangleArrayRENEW {

    static class FillTriangleArrayWithSpecialNumbers{
        void fillTriangleArrayWithSpecialNumbersFunction(int[][] array){
            DisplayRowOfTriangleArray displayRowOfTriangleArray = new DisplayRowOfTriangleArray();
            JumpToNextRow jumpToNextRow = new JumpToNextRow();

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
                        displayRowOfTriangleArray.displayRowOfTriangleArrayFunction(array, i, j);
                    }
                }
                jumpToNextRow.jumpToNextRowFunction();
            }
        }
    }

    static class DisplayRowOfTriangleArray{
        void  displayRowOfTriangleArrayFunction(int[][] array, int i, int j){
            System.out.print(array[i][j] + " ");
        }
    }


    static class JumpToNextRow{
        void  jumpToNextRowFunction(){
            System.out.println();
        }
    }
    public static void main(String[] args) {
        final int K = 10;
        int[][] TriangleArray = new int[K][K];
        TriangleArray[0][0] = 1;
        CommonDividerRENEW.DisplayCommonDivider.displayCommonDividerFunction(TriangleArray[0][0]);
        FillTriangleArrayWithSpecialNumbers fillTriangleArrayWithSpecialNumbers = new FillTriangleArrayWithSpecialNumbers();
        fillTriangleArrayWithSpecialNumbers.fillTriangleArrayWithSpecialNumbersFunction(TriangleArray);
    }
}
// Получилось только такой вывод сделать,
// у меня был вариант как сделать красивый вывод треугольника,
// но код очень объемный получался и не красивый, так что только так,
// И код упростить не получилось, без понятия как это сделать...