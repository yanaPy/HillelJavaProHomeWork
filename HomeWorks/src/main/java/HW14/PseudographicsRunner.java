package HW14;


import java.util.Arrays;
import java.util.Scanner;

public class PseudographicsRunner {
    public static void main(String [] args) {
        Pseudographics[] numbs = Pseudographics.createPseudographics(
                "  @@      @@     @@@@@   @@@@@  @       @@@@@@@  @@@@@  @@@@@@@  @@@@@   @@@@@ ",
                " @   @    @@    @     @ @     @ @    @  @       @     @ @    @  @     @ @     @",
                "@     @  @ @          @       @ @    @  @       @           @   @     @ @     @",
                "@     @    @     @@@@@   @@@@@  @    @  @@@@@@  @@@@@@     @     @@@@@   @@@@@@",
                "@     @    @    @             @ @@@@@@@       @ @     @   @     @     @       @",
                " @   @     @    @       @     @      @  @     @ @     @   @     @     @ @     @",
                "  @@@    @@@@@  @@@@@@@  @@@@@       @   @@@@@   @@@@@    @      @@@@@   @@@@@@ "
        );



        int height = numbs[0].lines.length;
        System.out.print("Enter numb(s) from 0 to 10. Use space.");


        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();



        int[] num = Arrays.stream(str.split(" "))
                .mapToInt(Integer::parseInt).toArray();


        for (int i = 0; i < height; i++) {
                for (int numb : num) {
                    System.out.print(numbs[numb].lines[i] + " ");
                }
                System.out.println();
        }
    }
}
