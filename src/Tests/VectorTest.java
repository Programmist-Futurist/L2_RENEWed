import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class VectorTest {

    @Test
    public void addElement() {
        Vector vector = new Vector();
        vector.addElement("Smth");
        Assert.assertEquals("Smth", vector.ArrayOfLinks[0]);

    }

    @Test
    public void getElement() {
        Vector vector = new Vector();
        Object check = vector.getElement(0);
        Assert.assertEquals(null, check);
    }

    @Test
    public void deleteElement() {
        Vector vector = new Vector();
        for (int i=0; i<9; i++){
        vector.addElement(i);
    }
        vector.deleteElement(0);
        Assert.assertEquals(1, vector.ArrayOfLinks[0]);
    }

    @Test
    public void cleanArray() {
        Vector vector = new Vector();
        for (int i=0; i<9; i++){
            vector.addElement(i);
        }
        vector.cleanArray();
        Assert.assertEquals(null, vector.ArrayOfLinks[4]);
    }
}