package HW14;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Pseudographics {
    String[] lines;



    public Pseudographics(String... lines) {
        this.lines = lines;
    }


    public static Pseudographics[] createPseudographics(String... lines) {
        int height = lines.length;
        int width = (lines[0].length() - 9) / 10;
        return IntStream
                .range(0, 10)
                .mapToObj(digit ->
                        new Pseudographics(Stream
                                .of(lines)
                                .map(line -> line.substring(digit * (width + 1), (digit + 1) * (width + 1) - 1))
                                .toArray(String[]::new))
                ).toArray(Pseudographics[]::new);
    }

}
