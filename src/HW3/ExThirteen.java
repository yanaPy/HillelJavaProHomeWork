package HW3;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ExThirteen {

//(*)Вывести на экран шахматную доску 8х8 в виде 2 мерного массива (W - белые клетки , B - черные клети)
    public static void printChessboard(){
        Character[][] arr=new Character[8][8];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if(i%2==0){
                arr[i][j]= 'W';
                } else {
                    arr[i][j]= 'B';
                }
                System.out.println(arr[i][j]);

            }


        }
        System.out.print(arr);
    }
}
