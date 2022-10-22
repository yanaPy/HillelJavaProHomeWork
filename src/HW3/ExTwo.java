package HW3;

public class ExTwo {

//    Дано число n при помощи цикла for посчитать факториал n!
    public static void calcFactorial(int n){
        int sum = 1;
        for (int i = 1; i < n;) {
            sum *=++i;
        }
        System.out.println(sum);
    }
}
