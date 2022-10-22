package HW3;

import java.util.Arrays;

public class ExSix {
    // TODO: 22.10.2022 not ready 
//    Вывести 10 первых чисел последовательности 0, -5,-10,-15..
    public static void printFirstNumsOfSequence(){
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
