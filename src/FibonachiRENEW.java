import java.util.Arrays;

public class FibonachiRENEW {

    static class FillArrayWithFibbonachiNumbers{
        int[] fibbonachiFunc(int[] array){
            for(int i=2; i<20; i++){
                array[i]=array[i-1]+array[i-2];
            }
            return array;
        }
    }
    public static void main(String[] args){
        int[] fibonachiArray = new int[20];
        fibonachiArray[0] = 1;
        fibonachiArray[1] = 1;
        FillArrayWithFibbonachiNumbers fillArrayWithFibbonachiNumbers = new FillArrayWithFibbonachiNumbers();
        fibonachiArray =fillArrayWithFibbonachiNumbers.fibbonachiFunc(fibonachiArray);
        ArraySimpleNumRENEW.DisplayArrayOut.displayArrayOutFunction(fibonachiArray);
    }
}
