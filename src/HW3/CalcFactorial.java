package HW3;

public class CalcFactorial {

//    Дано число n при помощи цикла for посчитать факториал n!
    public static void calcFactorial(int n){
        int sum = 1;
        for (int i = 1; i < n;) {
            sum *=++i;
        }
        System.out.println(sum);
    }



//    Перепишите программы с использованием цикла while.
    public static void calcFactorialUsingWhile(int n){
        int sum = 1;
        int i = 1;
        while (i!=n) {
            sum *=++i;
        }
        System.out.println(sum);
    }

//    Перепишите программы с использованием цикла do while.

    public static void calcFactorialUsingDoWhile(int n){
        int sum = 1;
        int i = 1;
        do{
            sum *=++i;
        }
        while (i!=n);
        System.out.println(sum);
    }
}
