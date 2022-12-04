package HW14;


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

        int[] num = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        for (int i = 0; i < height; i++) {
            for (int numb : num) {
                System.out.print(numbs[numb].lines[i] + " ");
            }
            System.out.println();
        }
    }
}
