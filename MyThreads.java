import com.sun.xml.internal.fastinfoset.stax.factory.StAXOutputFactory;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MyThreads {
//    private ThreadIterator;
ArrayList<Integer> listMain = new ArrayList<>();

    public static void main(String[] args) {
//         ArrayList<Integer> listMain = new ArrayList<>();

//        Scanner scanner = new Scanner(System.in);
//        public int firstNumber = scanner.nextInt();
//        public int lastNumber = scanner.nextInt();
//        public int threadsNumber = scanner.nextInt();
        Input input = new Input();
        SysOut sysOut = new SysOut();
//        public void threadsCreation () {
            for (int i = 0; i < input.threadsNumber; i++) {
                System.out.println("HELLO");
                Thread thread = new Thread(new ThreadIterator(i, input.firstNumber, input.lastNumber, input.threadsNumber));
//                thread.setDaemon(true);
                thread.start();
            }
//            System.out.println(list);
//        listMain.add();
//        sysOut.sysOut(listMain);
        }
    }
//}
class SysOut{
    ArrayList<Integer> list1;
    public void sysOut(ArrayList list) {
        this.list1 = list;
        System.out.println(Arrays.toString(list.toArray()));
    }
}

class Input {
    Scanner scanner = new Scanner(System.in);
    public int firstNumber = scanner.nextInt();
    public int lastNumber = scanner.nextInt();
    public int threadsNumber = scanner.nextInt();
}


    class ThreadIterator implements Runnable {
    MyThreads myThreads = new MyThreads();
        int i;
        List<Integer> list1;
        int first;
        int last;
        int threadsNum;

         public ThreadIterator(int i, int firstNumber, int lastNumber, int threadsNumber) {
             this.i = i;

             this.first = firstNumber;
             this.last = lastNumber;
             this.threadsNum = threadsNumber;
         }
//         public ThreadIterator(){
//
//         }


             @Override
             public void run () {
                 list1 = new ArrayList<>();
//                 System.out.print("1");
//                 System.out.print("1");
                 for (int q = (first + i); q <= last; q += threadsNum) {
                     int determinant = 0;
//                     System.out.print("2");

                     for (int k = 2; k < q; k++) {
//                         System.out.print("3");

                         double temp = q % k;
                         if (temp == 0) {
                             determinant+=1;
                         }
                     }

                     if (determinant == 0) {

                         list1.add(q);
//                         System.out.print("Hello");
                     }
                 }
                 System.out.println(list1);
//                 myThreads.listMain.add(list1);
             }
    }


