import java.util.Arrays;

public class FibonachiRENEW {

    static class FibbonachClass{
        int[] fibbonachiFunc(int[] array){
            for(int i=2; i<20; i++){
                array[i]=array[i-1]+array[i-2];
            }
            return array;
        }
    }
    public static void main(String[] args){
        int[] array = new int[20];
        array[0] = 1;
        array[1] = 1;
        FibbonachClass fibbonachClass = new FibbonachClass();
        array = fibbonachClass.fibbonachiFunc(array);
        ArraySimpleNumRENEW.ArrOut.arrayOut(array);
    }
}
