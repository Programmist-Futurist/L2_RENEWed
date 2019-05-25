/**
 * In this class number with 6 digits is checked on equality of its 2 parts,
 * sum of first 3 digits, compared with sum of second 3 digits
 */
public class EqualityOfHalfsRENEW {

    /**
     * Class contains method that count number of number's which parts are equal
     */
    static class CountHappyTickets{
        /**
         * Method determines amount of numbers that have equal sum of parts
         * @param First
         * @param Last
         * @param total
         * @return total quantity of these numbers
         */
        int countHappyTicketsFunction(int First, int Last, int total){
            for(int i=First; i<=Last; i++) {
                int i1 = i / 100000 % 10;
                int i2 = i / 10000 % 10;
                int i3 = i / 1000 % 10;
                int i4 = i / 100 % 10;
                int i5 = i / 10 % 10;
                int i6 = i % 10;
                if ((i1 + i2 + i3) == (i4 + i5 + i6)) {
                    total++;
                }
            }
            return total;
        }
    }

    /**
     * Starts the work of all methods of the class EqualityOfHalfsRENEW
     * @param args
     */
    public static void main(String[] args){
        final int FIRST =1000000;
        final int LAST=1999999;
        int total = 0;
        CountHappyTickets countHappyTickets = new CountHappyTickets();
        total = countHappyTickets.countHappyTicketsFunction(FIRST, LAST, total);
        CommonDividerRENEW.DisplayCommonDivider.displayCommonDividerFunction(total);

    }
}

