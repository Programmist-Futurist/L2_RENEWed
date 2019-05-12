import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SumOfRowRENEWTest {

    @Test
    public void main() {
        SumOfRowRENEW.SumOfFactorials sumOfFactorials = new SumOfRowRENEW.SumOfFactorials();
        int sum_of_factorials = sumOfFactorials.sumOfFactorialsFunction(4);
        Assert.assertEquals(33, sum_of_factorials);
    }
}