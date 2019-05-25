import java.util.Arrays;
import java.util.Scanner;

/**
 * In this class creating matrix and working with it
 */
public class Matrix {

    final int RANGE_OF_ELEMENTS = 10;

    double[][] matrix_array;
    final int columns = 5;
    final int rows = 5;

    /**
     *  /**
     *      * Assigning Values in the matrix (array)
     */
    public Matrix(){
        matrix_array = new double[columns][rows];
        for(int i=0; i<columns; i++){
            for(int j=0; j<rows; j++){
                matrix_array[i][j] = Math.random()*RANGE_OF_ELEMENTS;
            }
        }
    }

    /**
     * Multiplying each element by number
     * Using cycles to do it
     * @param num
     */
    public void multiplyByNumber(int num){
        for(int i=0; i<columns; i++ ) {
            for(int j=0; j<rows; j++){
                matrix_array[i][j]*=num;
            }
        }
    }

    /**
     * Adding each element of primary matrix to another matrix (double[][] array)
     * We can not add arrays with different length, method checks it
     * @param matrix2
     */
    public void addToAnotherMatrix(double[][] matrix2){
        if (matrix2.length == matrix_array.length && matrix2[1].length == matrix_array[1].length){
            for(int i=0; i<columns; i++ ) {
                for(int j=0; j<rows; j++){
                    matrix_array[i][j]+=matrix2[i][j];
                }
            }
        }
    }

    /**
     * Multiplying of the primary matrix (double[][] array) on another one,
     * Method checks does amount of
     * Columns of primary matrix array and rows of another matrix array
     * are equal
     * @param matrix2
     */
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

    /**
     * Method changes the placing of elements inside array
     * in order to make Transposition of matrix
     * by the rule of transposition of matrixs
     */
    public void matrixTransposition(){
        double[][] tempMatrix = new double[matrix_array[1].length][matrix_array.length];
            for (int i = 0; i < matrix_array.length; i++) {
                for (int j = 0; j < matrix_array[1].length; j++) {
                    tempMatrix[j][i] = matrix_array[i][j];
                }
            }
        matrix_array = tempMatrix;
    }

    /**
     * Method displays matrix (double[][] array) in String type
     */
    public static void displayMatrix(){
        Matrix matrix = new Matrix();
        System.out.println(Arrays.deepToString(matrix.matrix_array));
    }

    /**
     * This method runs all methods from the class Matrix
     * @param args
     */
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
