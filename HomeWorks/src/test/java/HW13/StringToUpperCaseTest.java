package HW13;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class StringToUpperCaseTest{

    @Test
    void stringToUpperCaseTest(){
        List<String> strList = new ArrayList();
        strList.add("one");
        strList.add("two");


        Assertions.assertEquals("[{\"one\":\"ONE\"}, {\"two\":\"TWO\"}]",
                StringToUpperCase.convertToUpperCase(strList).toString());
    }

}