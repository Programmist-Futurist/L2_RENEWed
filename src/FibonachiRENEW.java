import java.util.Arrays;

public class FibonachiRENEW {
    public static void main(String[] args){
        int[] array = new int[20];
        array[0] = 1;
        array[1] = 1;
        for(int i=2; i<20; i++){
            array[i]=array[i-1]+array[i-2];
        }
        System.out.println(Arrays.toString(array));
    }
}
