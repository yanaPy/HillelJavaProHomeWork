package HW14;


import java.util.Arrays;
import java.util.Scanner;

public class PseudographicsRunner {
    public static void main(String[] args) {

        while (true) {
            System.out.println("Enter numb(s) from 0 to 9. Use space.");

            Scanner scanner = new Scanner(System.in);
            String str = scanner.nextLine();

            if (new Scanner(str).hasNextInt()) {
                int[] num = Arrays.stream(str.split(""))
                        .mapToInt(Integer::parseInt).toArray();
                Numbs numbs = new Numbs();
                numbs.printNumbs(num);

            } else{System.out.println("Error! Only numbers available.");}

            System.out.println("You want to continue? Enter y/n");
            String strNext = scanner.nextLine();
            if (strNext.equals("n")) break;
        }
    }
}
