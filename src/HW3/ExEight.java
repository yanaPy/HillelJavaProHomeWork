package HW3;

import java.util.Arrays;

public class ExEight {

/**     Создайте массив, содержащий 10 первых нечетных чисел. Выведете элементы массива на консоль в одну строку,
       разделяя запятой.**/
    public static void arrayOddNums(){
        int[] arr= new int[10];
        int i,x;
        for ( i = 0, x=1; i < arr.length; i++,x++) {
            if (x%2!=0){
                arr[i]=x;
                System.out.print(arr[i]+", ");
            }else {
                x++;
                arr[i]=x;
                System.out.print(arr[i]+", ");
            }
        }
        System.out.print(Arrays.toString(arr));
    }
}
