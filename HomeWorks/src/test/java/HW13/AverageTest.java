package HW13;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class AverageTest{

    @Test
     void average(){
        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);

        Assertions.assertEquals(1.5, Average.average(integerList));
    }

}