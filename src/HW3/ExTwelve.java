package HW3;

public class ExTwelve {

//    Найти среднее арифметическое всех элементов массива.
    public static void arithmeticMean(int[] arr){
        int sumOfElements=0;
        int arithmeticMean=0;
        for (int i = 0; i < arr.length;i++ ) {
            sumOfElements+=arr[i];
        }
        arithmeticMean=sumOfElements/arr.length;
        System.out.print(arithmeticMean);
    }
}
