public class EqualityOfHalfsRENEW {

    static class Equality{

        int equalityFunc(int F, int L, int total){
            for(int i=F; i<=L; i++) {
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
        final int F=1000000;
        final int L=1999999;
        int total = 0;
        CommonDividerRENEW.Out1 out1 = new CommonDividerRENEW.Out1();
        Equality equality = new Equality();
        total = equality.equalityFunc(F, L, total);
        CommonDividerRENEW.Out1.out1Func(total);

    }
}

