package HW14;

public class Main {
    public static void main(String[] args) {
        Pseudographics[] digits;
        digits = Pseudographics.createPseudographics(
          "  @@      @@     @@@@@   @@@@@  @       @@@@@@@  @@@@@  @@@@@@@  @@@@@   @@@@@ ",
                " @   @    @@    @     @ @     @ @    @  @       @     @ @    @  @     @ @     @",
                "@     @  @ @          @       @ @    @  @       @           @   @     @ @     @",
                "@     @    @     @@@@@   @@@@@  @    @  @@@@@@  @@@@@@     @     @@@@@   @@@@@@",
                "@     @    @    @             @ @@@@@@@       @ @     @   @     @     @       @",
                " @   @     @    @       @     @      @  @     @ @     @   @     @     @ @     @",
                "  @@@    @@@@@  @@@@@@@  @@@@@       @   @@@@@   @@@@@    @      @@@@@   @@@@@@ "
        );
        int height = digits[0].lines.length;

        // число 5781, для удобства уже разбитое на цифры
        int[] number = {0,1, 2, 3, 4,5,6,7,8,9};
        for (int i = 0; i < height; i++) {
            for (int digit : number) {
                System.out.print(digits[digit].lines[i] + " ");
            }
            System.out.println();
        }


    }
}
