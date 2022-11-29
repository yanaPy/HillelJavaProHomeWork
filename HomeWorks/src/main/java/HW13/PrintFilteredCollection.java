package HW13;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class PrintFilteredCollection {
    public static List<String> printFilteredCollection(List<String> strList){

        return  strList.stream().filter(Objects::nonNull)
                .filter(x->x.matches("[a-z]{4}"))
                .collect(Collectors.toList());
    }


}
