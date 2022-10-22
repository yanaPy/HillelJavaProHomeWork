package HW3;

public class ExOne {

    //При помощи цикла for вывести на экран нечетные числа от 1 до 99.
    public static void printOddNums(){
        for (int i= 1; i<=99;i++) {
            if (i%2!=0){
                System.out.println(i);
            }
        }
    }
}
