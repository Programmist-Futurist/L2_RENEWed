import java.util.Arrays;
import java.util.Scanner;

public class Matrix {

    final int RANGE_OF_ELEMENTS = 10;

    double[][] matrix_array;
    final int columns = 5;
    final int rows = 5;

    public Matrix(){
        matrix_array = new double[columns][rows];
        for(int i=0; i<columns; i++){
            for(int j=0; j<rows; j++){
                matrix_array[i][j] = Math.random()*RANGE_OF_ELEMENTS;
            }
        }
    }

    public void multiplyByNumber(int num){
        for(int i=0; i<columns; i++ ) {
            for(int j=0; j<rows; j++){
                matrix_array[i][j]*=num;
            }
        }
    }

    public void addToAnotherMatrix(double[][] matrix2){
        if (matrix2.length == matrix_array.length && matrix2[1].length == matrix_array[1].length){
            for(int i=0; i<columns; i++ ) {
                for(int j=0; j<rows; j++){
                    matrix_array[i][j]+=matrix2[i][j];
                }
            }
        }
    }

    public void multiplyByAnotherMatrix(double[][] matrix2){
        double[][] tempMatrix = new double[matrix_array.length][matrix_array.length];
        if (matrix2[1].length == matrix_array.length) {
            for (int i = 0; i < matrix_array.length; i++) {
                for (int q = 0; q < matrix_array.length; q++) {
                    for (int j = 0; j < matrix_array.length; j++) {
                        tempMatrix[i][q] += matrix_array[i][j] * matrix2[j][i];
                    }
                }
            }
        }
        matrix_array = tempMatrix;
    }


    public void matrixTransposition(){
        double[][] tempMatrix = new double[matrix_array[1].length][matrix_array.length];
            for (int i = 0; i < matrix_array.length; i++) {
                for (int j = 0; j < matrix_array[1].length; j++) {
                    tempMatrix[j][i] = matrix_array[i][j];
                }
            }
        matrix_array = tempMatrix;
    }

    public static void displayMatrix(){
        Matrix matrix = new Matrix();
        System.out.println(Arrays.deepToString(matrix.matrix_array));
    }

    public static void main(String[] args){
        Matrix matrix = new Matrix();
        matrix.multiplyByNumber(5);


//         Creation of the second matrix to work with!
        Scanner scan = new Scanner(System.in);
        int columns2 = scan.nextInt();
        int rows2 = scan.nextInt();
        double[][] matrix2 = new double [columns2][rows2];
        for(int i=0; i<columns2; i++ ) {
            for(int j=0; j<rows2; j++){
                matrix2[i][j] = Math.random() * 10;
            }
        }


        matrix.addToAnotherMatrix(matrix2);
        matrix.multiplyByAnotherMatrix(matrix.matrix_array);
        matrix.matrixTransposition();
        matrix.displayMatrix();
    }

}
