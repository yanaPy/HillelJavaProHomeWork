package HW10;

public class QuadraticEquation {

    public static void calc(int a, int b, int c) {
        double d;
        double x1;
        double x2;

        d = Math.pow(b, 2) - (4 * a * c);

        if (d == 0) {
            x1 = ((-1) * b + Math.sqrt(d)) / 2 * a;
            System.out.printf("Root of the equation = " + x1);
        } else if (d < 0) {
            System.out.printf("No real roots");
        } else {
            x1 = ((-1) * b + Math.sqrt(d)) / 2 * a;
            x2 = ((-1) * b - Math.sqrt(d)) / 2 * a;
            System.out.printf("Root of the equation x1 = " + x1 + " x2 = " + x2);
        }
    }
}
