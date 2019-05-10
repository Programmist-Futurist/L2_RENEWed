import java.util.Scanner;

public class SimpleNumRENEW {

    static class Cycle {

        int function(int num, int d) {
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    d += 1;
                }
            }
            return d;
        }
    }

    static class Out{
        void display (int d) {
            if (d == 0) {
                System.out.println("Simple!");
            } else {
                System.out.println("Not Simple!");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        int num = scaner.nextInt();
            int det = 0;
            Cycle cycle = new Cycle();
            det = cycle.function(num, det);
            Out out = new Out();
            out.display(det);
        }
}

