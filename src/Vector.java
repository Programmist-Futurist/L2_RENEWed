import java.util.Arrays;

public class Vector {


    final int BASIC_ARRAY_SIZE = 10;
    final int STARTED_QUANTITY = 0;
    public Object[] ArrayOfLinks = new Object[BASIC_ARRAY_SIZE];
    public int quantity_of_elements = STARTED_QUANTITY;


    public void addElement(Object link) {
        if (quantity_of_elements == ArrayOfLinks.length - 1) {
            Object[] newArray = new Object[ArrayOfLinks.length * 2];
            System.arraycopy(ArrayOfLinks, 0, newArray, 0, quantity_of_elements);
            ArrayOfLinks = newArray;
        }
            ArrayOfLinks[quantity_of_elements++] = link;
    }

    public Object getElement(int num_of_element) {
        return  ArrayOfLinks[num_of_element];
    }

    public void deleteElement(int num_of_element) {
        for (int i = num_of_element; i < quantity_of_elements; i++) {
            ArrayOfLinks[i] = ArrayOfLinks[i + 1];
            ArrayOfLinks[quantity_of_elements] = null;
            quantity_of_elements--;
        }
    }

    public void cleanArray () {
        Object[] clearArray = new Object[BASIC_ARRAY_SIZE];
        ArrayOfLinks = clearArray;
        quantity_of_elements = STARTED_QUANTITY;
    }

    public void displayAllElements(){
        System.out.println(Arrays.toString(ArrayOfLinks));
        System.out.println("Amount of links in array: " + quantity_of_elements);
    }

    public static void main(String[] args) {
//        Vector vector = new Vector();
//        vector.addElement("Some link");
//        vector.cleanArray();
//        for (int i=0; i<19;i++) {
//            vector.addElement(i);
//        }
//        vector.addElement("SecondLink");
//        vector.deleteElement(1);
//        vector.displayAllElements();
//        System.out.println(vector.getElement(0));
    }
}

