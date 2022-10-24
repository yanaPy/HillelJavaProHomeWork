package HW3;

public class PrintFirstNumbsOfSequence {
//    Вывести 10 первых чисел последовательности 0, -5,-10,-15..
    public static void printFirstNumbsOfSequence(){
        int x=0;
        for ( int i = 0; i < 10; i++) {
            System.out.println(x);
            x-=5;
        }
    }
}
