package HW3;

public class ExTen {

//    В массиве из задания 9. найти наибольший элемент.
    public static void findMaxArrayElement(int[] arr){
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>max){
                max=arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==max){
                System.out.println(max);
            }
        }
    }
}
