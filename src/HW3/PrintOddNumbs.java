package HW3;

public class PrintOddNumbs {

    //При помощи цикла for вывести на экран нечетные числа от 1 до 99.
    public static void printOddNumbs(){
        for (int i= 1; i<=99;i++) {
            if (i%2!=0){
                System.out.println(i);
            }
        }
    }

//    Перепишите программы с использованием цикла while.
    public static void printOddNumbsUsingWhile(){
        int i= 1;
        while (i!=100){
            if (i%2!=0){
                System.out.println(i);
            }
            i++;
        }
    }

//    Перепишите программы с использованием цикла do - while.
    public static void printOddNumbsUsingDoWhile(){
        int i= 1;
        do{
            if (i%2!=0){
                System.out.println(i);
            }
            i++;
        }
        while (i!=100);
    }

    /**     Создайте массив, содержащий 10 первых нечетных чисел. Выведете элементы массива на консоль в одну строку,
     разделяя запятой.**/
    public static void arrayOddNums(){
        int[] arr= new int[10];
        int i,x;
        for ( i = 0, x=1; i < arr.length; i++,x++) {
            if (x%2!=0){
                arr[i]=x;
                System.out.print(arr[i]);
                if(i < arr.length - 1){
                    System.out.print(", ");
                }
            }else {
                x++;
                arr[i]=x;
                System.out.print(arr[i]);
                if(i < arr.length - 1){
                    System.out.print(", ");
                }
            }
        }
    }
}
