import java.util.Iterator;
import java.util.Objects;
import java.util.Scanner;
import java.util.Arrays;


public class FindElement {
//    ArrayClass arrayClass = new ArrayClass();
//    Iterator iterator = arrayClass.list.iterator();

//    public String[] getParameters() {
//        Scanner scanner = new Scanner(System.in);
//        String parameter = scanner.nextLine();
//        String[] parameterArray = parameter.split(" ");
//        return parameterArray;
//    }

    public FindElement(){

    }

    public void findElementFunc() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write down parameters of good you want through the gap:");
        String parameter = scanner.nextLine();
        String[] parameterArray = parameter.split(" ");

        int i = 0;
        while(i<ArrayClass.list.size()){
            System.out.println("I am here 1");
            Object[] arrayTemp = ArrayClass.list.get(i);
            int determinant = 0;
            for (int j = 0; j<ArrayClass.BASIC_ARRAY_SIZE; j++) {
                System.out.println("I am here 2");
                for(int q = 0; q < parameterArray.length; q++) {
                    System.out.println("I am here 3");
                    String tempVar = String.valueOf(arrayTemp[j]);
                    if (tempVar.equals(parameterArray[q])) {
//                        System.out.println(arrayTemp);
                        determinant+=1;
                    }
                }
            }
            if(determinant==parameterArray.length) {
                System.out.println(Arrays.toString(arrayTemp));
            }
            i++;
        }
    }

//    public static void main(String[] args) {
//        ArrayClass arrayClass = new ArrayClass();
//
//        FindElement findElement = new FindElement();
//
////        String[] trialArray = new String[arrayClass.BASIC_ARRAY_SIZE];
////        arrayClass.getParameters();
//
//        arrayClass.addGood(arrayClass.goodName, arrayClass.price, arrayClass.color, arrayClass.size, arrayClass.amount, arrayClass.description);
////        arrayClass.getParameters();
////        arrayClass.AddGood(arrayClass.goodName, arrayClass.price, arrayClass.color, arrayClass.size, arrayClass.amount, arrayClass.description);
////        findElement.findElementFunc();
//        System.out.println(Arrays.deepToString(arrayClass.list.get(0)));
//        System.out.println(arrayClass.list.size());
//        findElement.findElementFunc();
//
//    }
}
