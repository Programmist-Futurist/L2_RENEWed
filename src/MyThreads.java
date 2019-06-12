import sun.awt.geom.AreaOp;
import sun.java2d.opengl.WGLSurfaceData;

import java.util.ArrayList;
import java.util.Scanner;

public class MyThreads {
    ArrayList<Integer> list = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        public int firstNumber = scanner.nextInt();
        public int lastNumber = scanner.nextInt();
        public int threadsNumber = scanner.nextInt();

        public void threadsCreation(){
            for (int i = 0; i < threadsNumber; i++ ){
                Thread thread = new Thread(new ThreadIterator(i));
                thread.start();
            }
            System.out.println(list);
        }

}


    class ThreadIterator implements Runnable {
        int i;
        ThreadIterator(int i){
        this.i = i;
        }

        @Override
        public void run() {
            MyThreads myThreads = new MyThreads();

            for (int q = i; q < myThreads.lastNumber; q += myThreads.threadsNumber) {
                int determinant = 0;
                for (int k = 2; k < q / 2; k++) {
                    if (q / 2 % k == 0) {
                        determinant++;
                    }
                }
                if (determinant==0){
                    myThreads.list.add(q);
                }
            }
        }
    }

