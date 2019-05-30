import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MatrixTest {

    @Test
    public void multiplyByNumber() {
        Matrix matrix = new Matrix(5,5);
        double check = matrix.matrix_array[0][0];
        check*=10;
        matrix.multiplyByNumber(10);
        Assert.assertEquals(check, matrix.matrix_array[0][0], 0.0);

    }

    @Test
    public void addToAnotherMatrix() {
        Matrix matrix = new Matrix(5,5);
        double check = matrix.matrix_array[0][0];
        check*=2;
        matrix.addToAnotherMatrix(matrix.matrix_array);
        Assert.assertEquals(check, matrix.matrix_array[0][0], 0.0);
    }

    @Test
    public void multiplyByAnotherMatrix() {
        Matrix matrix = new Matrix(5,5);
        double[][] checkArray = new double[1][1];
        for (int j = 0; j < matrix.matrix_array.length; j++) {
            checkArray[0][0] += matrix.matrix_array[0][j]*matrix.matrix_array[j][0];
        }
        matrix.multiplyByAnotherMatrix(matrix.matrix_array);
        Assert.assertEquals(checkArray[0][0], matrix.matrix_array[0][0], 0.0);
    }

    @Test
    public void matrixTransposition() {
        Matrix matrix = new Matrix(5,5);
        double check = matrix.matrix_array[0][1];
        matrix.matrixTransposition();
        Assert.assertEquals(check, matrix.matrix_array[1][0], 0.0);
    }
}