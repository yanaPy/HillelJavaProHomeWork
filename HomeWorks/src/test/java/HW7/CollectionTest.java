package HW7;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CollectionTest  {

    @Test
    void add() {
//        String[] array = new String[]{"A"};
        Collection collection = new Collection();
        Assertions.assertTrue(collection.add("A"));
        Assertions.assertEquals(1, collection.getSize());
        Assertions.assertEquals("A",collection.get(0));
    }

    @Test
    void testAdd() {
        Collection collection = new Collection();
        Assertions.assertTrue(collection.add(0,"A"));
        Assertions.assertEquals(1, collection.getSize());
//        Assertions.assertEquals("A",collection.get(0));

        Assertions.assertFalse(collection.add(2,"B"));


    }

    @Test
    void delete() {
        Collection collection = new Collection(new String[]{"A"});
        Assertions.assertFalse(collection.delete(2));
        Assertions.assertTrue(collection.delete(0));
        Assertions.assertEquals(0, collection.getSize());
    }

    @Test
    void testDelete() {
        Collection collection = new Collection(new String[]{"A","B"});
        Assertions.assertTrue(collection.delete("A"));
        Assertions.assertEquals(0, collection.getSize());
        Assertions.assertFalse(collection.delete("C"));

    }

    @Test
    void get() {
    }

    @Test
    void size() {
    }
}