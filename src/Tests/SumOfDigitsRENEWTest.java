import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SumOfDigitsRENEWTest {

    @Test
    public void main() {
        SumOfDigitsRENEW.DigitsSum digitsSum = new SumOfDigitsRENEW.DigitsSum();
        int sum_of_digits = digitsSum.digitsSumFunc(1234);
        Assert.assertEquals(10, sum_of_digits);
    }
}