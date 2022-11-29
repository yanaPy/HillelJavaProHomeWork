package HW13;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class StringToUpperCase {

    public static List<Pair> convertToUpperCase(List<String> strList){
        List<Pair> list=strList.stream().filter(Objects::nonNull).map(x->new Pair(x,x.toUpperCase()))
                .collect(Collectors.toList());
        return list;
    }

    static class Pair{
        private String lowerCase;
        private String upperCase;

        public Pair(String lowerCase, String upperCase) {
            this.lowerCase = lowerCase;
            this.upperCase = upperCase;
        }


        @Override
        public String toString() {
            return "{" +
                    "\"" + lowerCase + "\":" +
                    "\"" + upperCase + "\"" +
                    '}';
        }
    }
}
