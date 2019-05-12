import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;
public class ArraySimpleNumRENEWTest {

    @Test
    public void main() {
        int[] ArrayWithSimpleNumbersTest = new int[10];
        ArraySimpleNumRENEW.FillArrayWithSimpleNumbers fillArrayWithSimpleNumbers = new ArraySimpleNumRENEW.FillArrayWithSimpleNumbers();
        ArrayWithSimpleNumbersTest = fillArrayWithSimpleNumbers.fillArrayWithSimpleNumbersFunction(9);
        Assert.assertEquals(3, ArrayWithSimpleNumbersTest[1]);

    }
}
