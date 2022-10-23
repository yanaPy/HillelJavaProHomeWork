package HW3;

public class ExTwelve {

//    Найти среднее арифметическое всех элементов массива.
    public static void arithmeticMean(int[] arr){
        int sumOfElements=0;
        int arithmeticMean;
        for (int j : arr) {
            sumOfElements += j;
        }
        arithmeticMean=sumOfElements/arr.length;
        System.out.println("Arithmetic mean array elements "+arithmeticMean);
    }
}
