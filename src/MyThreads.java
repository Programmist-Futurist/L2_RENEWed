import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MyThreads {
   public ArrayList<Integer> list = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        public int firstNumber = scanner.nextInt();
        public int lastNumber = scanner.nextInt();
        public int threadsNumber = scanner.nextInt();

        public void threadsCreation(){
            for (int i = 0; i < threadsNumber; i++ ){
                System.out.print("HELLO");
                Thread thread = new Thread(new ThreadIterator(i, list));
                thread.setDaemon(true);
                thread.start();
                try {
                    thread.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(Arrays.toString(list.toArray()));
        }

}


    class ThreadIterator implements Runnable {
        int i;
        List<Integer> list1;

         public ThreadIterator(int i, List<Integer> list) {
             this.i = i;
             this.list1 = list;
         }

             @Override
             public void run () {
                 MyThreads myThreads = new MyThreads();
                 System.out.print("1");
                 for (int q = myThreads.firstNumber + i; q < myThreads.lastNumber; q += myThreads.threadsNumber) {
                     int determinant = 0;
                     System.out.print("2");
                     for (int k = 2; k <= q / 2; k++) {
                         System.out.print("3");
                         if (q / 2 % k == 0) {
                             determinant++;
                         }
                     }
                     if (determinant == 0) {
                         list1.add(q);
                         System.out.print(q);
                     }
                 }

         }
    }

