import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class DoubleArrayRENEWTest {

    @Test
    public void main() {
    final int ARRAY_SIZE = 5;
    char[][] DoubleArray = new char[ARRAY_SIZE][ARRAY_SIZE];
    DoubleArrayRENEW.FillDoubleArrayWithChars fillDoubleArrayWithChars = new DoubleArrayRENEW.FillDoubleArrayWithChars();
    DoubleArray = fillDoubleArrayWithChars.fillDoubleArrayWithCharsFunction(DoubleArray);
    Assert.assertEquals('Б', DoubleArray[1][0]);
}
}