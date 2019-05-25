import java.util.Arrays;

/**
 * In this class (int[] array) fills with Fibonachi numbers
 */
public class FibonachiRENEW {

    /**
     * Class contains method which fills (int[] array) with Fibonachi numbers
     */
    static class FillArrayWithFibbonachiNumbers{
        /**
         * Method fills (int[] array) with Fibonachi numbers
         * @param SomeArray
         * @return Array full of Fibonachi numbers
         */
        int[] fibbonachiFunc(int[] SomeArray){
            for(int i=2; i<20; i++){
                SomeArray[i]=SomeArray[i-1]+SomeArray[i-2];
            }
            return SomeArray;
        }
    }

    /**
     * Starts the work of all methods of the class FibonachiRENEW
     * @param args
     */
    public static void main(String[] args){
        int[] fibonachiArray = new int[20];
        fibonachiArray[0] = 1;
        fibonachiArray[1] = 1;
        FillArrayWithFibbonachiNumbers fillArrayWithFibbonachiNumbers = new FillArrayWithFibbonachiNumbers();
        fibonachiArray =fillArrayWithFibbonachiNumbers.fibbonachiFunc(fibonachiArray);
        ArraySimpleNumRENEW.DisplayArrayOut.displayArrayOutFunction(fibonachiArray);
    }
}
