package HW14;

public class Numbs {
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

    void printNumbs(int[] numbers) {
        for (int i = 0; i < height; i++) {
            for (int numb : numbers) {
                System.out.print(numbs[numb].lines[i] + " ");
            }
            System.out.println();
        }
    }
}
