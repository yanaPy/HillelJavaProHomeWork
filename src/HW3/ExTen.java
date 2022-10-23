package HW3;

public class ExTen {

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
