package HW14;

public class Numbs {
    int[] numbers;
    Pseudographics[] numbs = Pseudographics.createPseudographics(
            "  @@      @@     @@@@@   @@@@@  @       @@@@@@@  @@@@@  @@@@@@@  @@@@@   @@@@@ ",
            " @   @    @@    @     @ @     @ @    @  @       @     @ @    @  @     @ @     @",
            "@     @  @ @          @       @ @    @  @       @           @   @     @ @     @",
            "@     @    @     @@@@@   @@@@@  @    @  @@@@@@  @@@@@@     @     @@@@@   @@@@@@",
            "@     @    @    @             @ @@@@@@@       @ @     @   @     @     @       @",
            " @   @     @    @       @     @      @  @     @ @     @   @     @     @ @     @",
            "  @@@    @@@@@  @@@@@@@  @@@@@       @   @@@@@   @@@@@    @      @@@@@   @@@@@@ "
    );

    public Numbs(int[] num) {
        this.numbers = numbers;
    }

    int height = numbs[0].lines.length;

    // число 5781, для удобства уже разбитое на цифры

    void printNumbs(int[] numbers) {
        for (int i = 0; i < height; i++) {
            for (int numb : numbers) {
                System.out.print(numbs[numb].lines[i] + " ");
            }
            System.out.println();
        }
    }


}
