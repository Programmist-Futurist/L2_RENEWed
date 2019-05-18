import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FibonachiRENEWTest {

    @Test
    public void main() {
        int[] fibonachiArray = new int[20];
        fibonachiArray[0] = 1;
        fibonachiArray[1] = 1;
        FibonachiRENEW.FillArrayWithFibbonachiNumbers fillArrayWithFibbonachiNumbers = new FibonachiRENEW.FillArrayWithFibbonachiNumbers();
        fibonachiArray =fillArrayWithFibbonachiNumbers.fibbonachiFunc(fibonachiArray);
        Assert.assertEquals(5, fibonachiArray[4]);
    }
}