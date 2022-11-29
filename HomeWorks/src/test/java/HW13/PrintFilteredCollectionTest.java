package HW13;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class PrintFilteredCollectionTest{

    @Test
    void printFilteredCollection(){
        List<String> strList = new ArrayList();
        strList.add("one");
        strList.add("two");
        strList.add("three");
        strList.add("four");
        strList.add("FIVE");

        Assertions.assertEquals("[four]",
                PrintFilteredCollection.printFilteredCollection(strList).toString());
        Assertions.assertNotEquals("[FIVE]",
                PrintFilteredCollection.printFilteredCollection(strList).toString());
        Assertions.assertNotEquals("[two]",
                PrintFilteredCollection.printFilteredCollection(strList).toString());
        Assertions.assertNotEquals("[three]",
                PrintFilteredCollection.printFilteredCollection(strList).toString());

    }

}