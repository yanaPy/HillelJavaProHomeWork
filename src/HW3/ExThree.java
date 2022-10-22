package HW3;

public class ExThree {

    //    Перепишите программы с использованием цикла while.
    public static void printOddNums(){
        int i= 1;
        while (i!=100){
            if (i%2!=0){
                System.out.println(i);
            }
            i++;
        }
    }

    public static void calcFactorial(int n){
        int sum = 1;
        int i = 1;
        while (i!=n) {
            sum *=++i;
        }
        System.out.println(sum);
    }
}
