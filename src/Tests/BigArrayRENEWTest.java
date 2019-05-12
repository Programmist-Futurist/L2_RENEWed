import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class BigArrayRENEWTest {

    @Test
    public void main() {
        BigArrayRENEW.FillDeepArrayWithNumbers fillDeepArrayWithNumbers = new BigArrayRENEW.FillDeepArrayWithNumbers();
        int[][][][][][] deepArrayWithNumbersTest = new int[2][2][2][2][2][2];
        deepArrayWithNumbersTest = fillDeepArrayWithNumbers.fillDeepArrayWithNumbersFunction(deepArrayWithNumbersTest);
        Assert.assertEquals(64, deepArrayWithNumbersTest[1][1][1][1][1][1]);
    }
}