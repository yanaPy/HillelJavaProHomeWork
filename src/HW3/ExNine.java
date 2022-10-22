package HW3;

public class ExNine {

    /** Дан массив размерности N, найти наименьший элемент массива и вывести на консоль
    (если наименьших элементов несколько — вывести их все).**/
    public static void findMinArrayElement(int[] arr){
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<min){
                min=arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==min){
                System.out.println(min);
            }
        }
    }
}
