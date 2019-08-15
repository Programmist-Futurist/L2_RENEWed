import java.util.ArrayList;
import java.util.Scanner;

public class ArrayClass {

    final static int BASIC_ARRAY_SIZE = 6;
    static  ArrayList<Object[]> list = new ArrayList<>();

    Scanner scanner = new Scanner(System.in);
    String goodName;
    Integer price;
    String color;
    String size;
    Integer amount;
    String description;

    public void getParameters() {
        this.scanner = new Scanner(System.in);
        System.out.println("Write down the name of good:");
        this.goodName = scanner.nextLine();
        System.out.println("Write down the price of good:");
        this.price = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Write down the color of good:");
        this.color = scanner.nextLine();
        System.out.println("Write down the size of good:");
        this.size = scanner.nextLine();
        System.out.println("Write down the amount of certain good:");
        this.amount = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Write down the description of good:");
        this.description = scanner.nextLine();
    }


    public void addGood() {
        getParameters();

        Object[] TempArray = new Object[BASIC_ARRAY_SIZE];
        TempArray[0] = goodName;
        TempArray[1] = price;
        TempArray[2] = color;
        TempArray[3] = size;
        TempArray[4] = amount;
        TempArray[5] = description;
        this.list.add(TempArray);
    }

}
