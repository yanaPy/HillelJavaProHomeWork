package HW13;

import java.util.List;

public class Average {

    public static double average(List<Integer> integerList) {
        return integerList.stream()
                .mapToDouble(x -> Integer.parseInt(String.valueOf(x)))
                .average().getAsDouble();
    }

}
