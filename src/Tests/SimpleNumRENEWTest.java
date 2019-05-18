import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SimpleNumRENEWTest {

    @Test
    public void main() {
        int determinant = 0;
        SimpleNumRENEW.SimpleNumOrNot simpleNumOrNot = new SimpleNumRENEW.SimpleNumOrNot();
        determinant = simpleNumOrNot.simpleNumOrNotFunction(13, determinant);
        Assert.assertEquals(0, determinant);
    }
}