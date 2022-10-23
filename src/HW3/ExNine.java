package HW3;

public class ExNine {

    /**
     * Дан массив размерности N, найти наименьший элемент массива и вывести на консоль
     * (если наименьших элементов несколько — вывести их все).
     **/
    public static int findMinArrayElement(int[] arr){
        int min = arr[0];
        for (int k : arr) {
            if (k < min) {
                min = k;
            }
        }
        for (int j : arr) {
            if (j == min) {
                System.out.println("\n" + "Min element of array " + min);
            }
        }
        return min;
    }
}
