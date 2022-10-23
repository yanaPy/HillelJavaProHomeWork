package HW3;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        while (true) {

            System.out.println("Choose number of exercise to show work:");
            System.out.println("1 - Print odd numbers from 1 to 99 on the screen.(Ex 1.)");
            System.out.println("2 - Calc n!(Ex 2.)");
            System.out.println("3 - With while.(Ex 3)");
            System.out.println("4 - With do - while (Ex 4)");
            System.out.println("5 - Calc x^n. (Ex 5)");
            System.out.println("6 - Print the first 10 numbers in the sequence 0, -5, -10, -15..(Ex 6)");
            System.out.println("7 - Display multiplication table (Ex 7)");
            System.out.println("8 - Create an array containing the first 10 odd numbers. " +
                    "Print the elements of the array to the console in one line, separated by a comma. (Ex 8)");
            System.out.println("9 - Array operations (Ex 9-12)");
            System.out.println("10 - Display an 8x8 chessboard as a 2-dimensional array " +
                    "(W - white cells, B - black cells) (Ex 13)");
            System.out.println("11 - Quit");

            Scanner input = new Scanner(System.in);
            int choice = input.nextInt();

            if (choice == 1) {
                ExOne.printOddNums();
            } else if (choice == 2) {
                System.out.println("Enter n for calc factorial");
                int n = input.nextInt();
                ExTwo.calcFactorial(n);
            } else if (choice == 3) {
                ExThree.printOddNums();
                System.out.println("Enter n for calc factorial");
                int n = input.nextInt();
                ExThree.calcFactorial(n);
            } else if (choice == 4) {
                ExFour.printOddNums();
            } else if (choice == 5) {
                System.out.println("Enter x for calc x^n");
                int x = input.nextInt();
                System.out.println("Enter n for calc x^n");
                int n = input.nextInt();
                ExFive.calcDegree(x, n);
            } else if (choice == 6) {
                ExSix.printFirstNumsOfSequence();
            } else if (choice == 7) {
                System.out.println("Enter N for print multiply table for N");
                int n = input.nextInt();
                ExSeven.multiplyTable(n);
            } else if (choice == 8) {
                ExEight.arrayOddNums();
            } else if (choice == 9) {
                System.out.println("Enter array size");
                int n = input.nextInt();
                int[] arr = createArray(n);
//                ExNine.findMinArrayElement(arr);
//                ExTen.findMaxArrayElement(arr);
                ExEleven.swapElementsOfArray(arr);
                ExTwelve.arithmeticMean(arr);
            } else if (choice == 10) {
                ExThirteen.printChessboard();
            } else if (choice == 11) {
                break;
            } else {
                System.out.println("Invalid choice");
            }
        }
    }

    public static int[] createArray(int n) {
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = new Random().nextInt(-100, 100);
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        return array;
    }
}