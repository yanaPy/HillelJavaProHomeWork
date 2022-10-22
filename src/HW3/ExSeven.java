package HW3;

import java.util.Arrays;

public class ExSeven {

//    Необходимо вывести на экран таблицу умножения на Х: (любое число вводимое из консоли)
    public static void multiplyTable( int x){
        for (int i = 1; i <= 10; i++) {
            int sum=x*i;
            System.out.println(x+"*"+i+"="+sum);
        }
    }
}
