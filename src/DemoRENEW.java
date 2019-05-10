public class DemoRENEW {
    static class Class1{
        void Func() {
            System.out.println("Task1:\n" + "Написать программу, которая находит наибольший общий делитель двух целых положительных чисел;\n" + "Введите числа НОД которых необходимо вычислить:");
            CommonDividerRENEW.main(null);
        }
    }

    static class Class2{
        void Func() {
            System.out.println("Task2:\n"+ "Написать программу, которая находит сумму цифр произвольного целого числа;\n" + "Введите число, сумму цифр которого необходимо посчитать:");
            SumOfDigitsRENEW.main(null);
        }
    }

    static class Class3{
        void Func() {
            System.out.println("Task3:\n" + "Написать программу проверки того, что заданное число Х – простое;\n" + "Введите число, чтоб определить простое оно или нет:");
            SimpleNumRENEW.main(null);
        }
    }

    static class Class4{
        void Func() {
            System.out.println("Task4:\n" + "Сосчитать сумму ряда для заданного числа n > 0;\n" + "Введите число для которого необходимо сосчитать сумму ряда:");
            SumOfRowRENEW.main(null);
        }
    }

    static class Class5{
        void Func() {
            System.out.println("Task5:\n" + "Подсчитать, сколько шестизначных цифр имеют равную сумму трех первых и трех последних цифр;");
            EqualityOfHalfsRENEW.main(null);
        }
    }
    static class Class6{
        void Func() {
            System.out.println("Task6:\n" + "Разместить в памяти массив из 20 элементов и заполнить его рядом Фиббоначчи;");
            FibonachiRENEW.main(null);
        }
    }
    static class Class7{
        void Func() {
            System.out.println("Task7:\n" + "Создать целый массив из 100 элементов и заполнить его простыми числами;");
            ArraySimpleNumRENEW.main(null);
        }
    }
    static class Class8{
        void Func() {
            System.out.println("Task8:\n" + "Создать двумерный массив символов и заполнить его буквами 'Ч' и 'Б' в шахматном порядке;");
            DoubleArrayRENEW.main(null);
        }
    }

    static class Class9{
        void Func() {
            System.out.println("Task9:\n" + "Создать целый шестимерный массив с двумя значениями в каждом измерении;");
            BigArrayRENEW.main(null);
        }
    }
    static class Class10{
        void Func() {
            System.out.println("Task10:\n" + "Создать \"треугольный\" массив из 10 строк и заполнить его биномиальными коэффициентами;");
            TriangleArrayRENEW.main(null);
        }
    }
    public static void main (String[] args){

        Class1 class1 = new Class1();
        Class2 class2 = new Class2();
        Class3 class3 = new Class3();
        Class4 class4 = new Class4();
        Class5 class5 = new Class5();
        Class6 class6 = new Class6();
        Class7 class7 = new Class7();
        Class8 class8 = new Class8();
        Class9 class9 = new Class9();
        Class10 class10 = new Class10();
        class1.Func();
        class2.Func();
        class3.Func();
        class4.Func();
        class5.Func();
        class6.Func();
        class7.Func();
        class8.Func();
        class9.Func();
        class10.Func();
    }
}
