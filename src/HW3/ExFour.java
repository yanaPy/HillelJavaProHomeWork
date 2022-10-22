package HW3;

public class ExFour {

//    Перепишите программы с использованием цикла do - while.
    public static void printOddNums(){
        int i= 1;
        do{
            if (i%2!=0){
                System.out.println(i);
            }
            i++;
        }
        while (i!=100);
    }

    public static void calcFactorial(int n){
        int sum = 1;
        int i = 1;
        do{
            sum *=++i;
        }
        while (i!=n);
        System.out.println(sum);
    }
}
