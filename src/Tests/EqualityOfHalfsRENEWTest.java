import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class EqualityOfHalfsRENEWTest {

    @Test
    public void main() {
        final int FIRST =1000000;
        final int LAST=1999999;
        int total = 0;
        EqualityOfHalfsRENEW.CountHappyTickets countHappyTickets = new EqualityOfHalfsRENEW.CountHappyTickets();
        total = countHappyTickets.countHappyTicketsFunction(FIRST, LAST, total);
        Assert.assertEquals(55252, total);
    }
}