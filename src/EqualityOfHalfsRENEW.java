public class EqualityOfHalfsRENEW {

    static class CountHappyTickets{

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

    public static void main(String[] args){
        final int First =1000000;
        final int Last=1999999;
        int total = 0;
        CountHappyTickets countHappyTickets = new CountHappyTickets();
        total = countHappyTickets.countHappyTicketsFunction(First, Last, total);
        CommonDividerRENEW.DisplayCommonDivider.displayCommonDividerFunction(total);

    }
}

