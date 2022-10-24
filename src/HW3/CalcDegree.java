package HW3;

public class CalcDegree {

//    Даны переменные x и n вычислить x^n.
    public static void calcDegree(int x,int n){
        int sum=x;
        for (int i = 1; i < n; i++) {
            sum*=x;
        }
        System.out.println(sum);
    }
}
