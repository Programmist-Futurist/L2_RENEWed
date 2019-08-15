import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayClass arrayClass = new ArrayClass();

        FindElement findElement = new FindElement();

//        String[] trialArray = new String[arrayClass.BASIC_ARRAY_SIZE];
//        arrayClass.getParameters();

        arrayClass.addGood();
//        arrayClass.getParameters();
//        arrayClass.AddGood(arrayClass.goodName, arrayClass.price, arrayClass.color, arrayClass.size, arrayClass.amount, arrayClass.description);
//        findElement.findElementFunc();
        System.out.println(Arrays.deepToString(arrayClass.list.get(0)));
        System.out.println(arrayClass.list.size());
        findElement.findElementFunc();

    }
}
