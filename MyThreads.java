import com.sun.xml.internal.fastinfoset.stax.factory.StAXOutputFactory;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.lang.Object;


public class MyThreads {
//    private ThreadIterator;
static ArrayList<Integer> listMain = new ArrayList<>();

    public static void main(String[] args) throws InterruptedException {





        Input input = new Input();
        SysOut sysOut = new SysOut();

            for (int i = 0; i < input.threadsNumber; i++) {
                Thread thread = new Thread(new ThreadIterator(i, input.firstNumber, input.lastNumber, input.threadsNumber));
                thread.start();
            }

            Thread.sleep(100);
            System.out.println(listMain);

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


    class  ThreadIterator implements Runnable {
//    MyThreads myThreads = new MyThreads();
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


             @Override
             public void run () {
                 list1 = new ArrayList<>();

                 for (int q = (first + i); q <= last; q += threadsNum) {
                     int determinant = 0;

                     for (int k = 2; k < q; k++) {

                         double temp = q % k;
                         if (temp == 0) {
                             determinant+=1;
                         }
                     }

                     if (determinant == 0) {

//                         MyThreads.listMain.add(q);
                         list1.add(q);

                     }
                 }
                 System.out.println(list1);

                 MyThreads.listMain.addAll(list1);
             }

    }


