import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CircleTest {

    @Test
    public void moveCenterOfCircle() {
        Circle circle = new Circle(2,2, 5);
        circle.moveCenterOfCircle(1,1);
        Assert.assertEquals(3, circle.x);
    }

    @Test
    public void doesPointRemainInCircle() {
        Circle circle = new Circle(2,2, 5);
        boolean check = circle.doesPointRemainInCircle(2,2);
        Assert.assertEquals(true, check);
    }

    @Test
    public void checkConsistancyOfCircle() {
        Circle circle = new Circle(2,2, 5);
        boolean check = circle.checkConsistancyOfCircle(10, 2, 2);
        Assert.assertEquals(false, check);
    }

}