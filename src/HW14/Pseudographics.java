package HW14;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Pseudographics {
    String[] lines;



    public Pseudographics(String... lines) {
        this.lines = lines;
    }



    /**
     * функция для удобного создания массива Digit[] из описания шрифта
     * работает только с моноширинными шрифтами,
     * причём моноширинность описания шрифта (то есть аргумента `lines`) должен гарантировать код, вызывающий функцию
     *
     * @param lines описание шрифта в виде строк с большими цифрами 0-9, цифры разделены пробелом
     * @return массив длины 10
     */
    public static Pseudographics[] createPseudographics(String... lines) {
        int height = lines.length;
        int width = (lines[0].length() - 9 /* десять цифр => девять пробелов */) / 10;
        return IntStream
                .range(0, 10)  // Stream из цифр 0-9
                .mapToObj(digit ->
                        new Pseudographics(Stream
                                .of(lines)
                                // цифры в line идут следующим образом:
                                // `width` символов цифры `0`, пробел,
                                // `width` символов цифры `1`, пробел,
                                // ...
                                .map(line -> line.substring(digit * (width + 1), (digit + 1) * (width + 1) - 1))
                                .toArray(String[]::new))
                ).toArray(Pseudographics[]::new);
    }
}
