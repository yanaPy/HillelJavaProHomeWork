package HW3;

public class ArrayOperations {

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

//    В массиве из задания 9. найти наибольший элемент.
    public static int findMaxArrayElement(int[] arr){
        int max = arr[0];
        for (int k : arr) {
            if (k > max) {
                max = k;
            }
        }
        for (int j : arr) {
            if (j == max) {
                System.out.println("Max element of array " + max);
            }
        }
        return max;
    }
}
