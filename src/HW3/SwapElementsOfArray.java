package HW3;

public class SwapElementsOfArray {
    /**
     * Поменять наибольший и наименьший элементы массива местами. Пример: дан массив {4, -5, 0, 6, 8}.
     * После замены будет выглядеть {4, 8, 0, 6, -5}.
     **/
    public static void swapElementsOfArray(int[] arr) {
        int min = ArrayOperations.findMinArrayElement(arr);
        int max = ArrayOperations.findMaxArrayElement(arr);
        int minIndex = 0, maxIndex = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == min) {
                minIndex = i;
            } else if (arr[i] == max) {
                maxIndex = i;
            }
            if (arr[i] == min) {
                System.out.println(arr[maxIndex]);
            } else if (arr[i] == max) {
                System.out.println(arr[minIndex]);
            } else
                System.out.println(arr[i]);
        }
    }
}
