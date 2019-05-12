import java.util.Arrays;

public class FibonachiRENEW {

    static class FillArrayWithFibbonachiNumbers{
        int[] fibbonachiFunc(int[] SomeArray){
            for(int i=2; i<20; i++){
                SomeArray[i]=SomeArray[i-1]+SomeArray[i-2];
            }
            return SomeArray;
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
