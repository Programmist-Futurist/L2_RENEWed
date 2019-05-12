import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CommonDividerRENEWTest {

    @Test
    public void main() {
        CommonDividerRENEW.FindCommonDivider findCommonDivider = new CommonDividerRENEW.FindCommonDivider();
        int commonDivider = findCommonDivider.findCommonDividerFunction(10,5);
        Assert.assertEquals(5, commonDivider);
    }
}