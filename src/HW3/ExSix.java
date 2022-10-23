package HW3;

public class ExSix {
//    Вывести 10 первых чисел последовательности 0, -5,-10,-15..
    public static void printFirstNumsOfSequence(){
        int x=0;
        for ( int i = 0; i < 10; i++) {
            System.out.println(x);
            x-=5;
        }
    }
}
