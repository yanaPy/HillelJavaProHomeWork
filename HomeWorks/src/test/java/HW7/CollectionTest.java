package HW7;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CollectionTest  {

    @Test
    void add() {
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
        Assertions.assertEquals("A",collection.get(0));
        Assertions.assertFalse(collection.add(2,"B"));
    }

    @Test
    void delete() {
        Collection collection = new Collection(new String[]{"A","B"});
        Assertions.assertFalse(collection.delete(2));
        Assertions.assertTrue(collection.delete(0));
        Assertions.assertEquals(1, collection.getSize());
    }

    @Test
    void testDelete() {
        Collection collection = new Collection(new String[]{"A","B"});
        Assertions.assertTrue(collection.delete("A"));
        Assertions.assertEquals(1, collection.getSize());
        Assertions.assertFalse(collection.delete("A"));
    }

    @Test
    void get() {
        Collection collection = new Collection(new String[]{"A","B"});
        Assertions.assertEquals("A",collection.get(0));
        Assertions.assertNotEquals("C",collection.get(1));
    }

    @Test
    void size() {
        Collection collection = new Collection(new String[]{"A","B","C"});
        Assertions.assertEquals(3, collection.getSize());
        collection.add("D");
        Assertions.assertEquals(4, collection.getSize());
        collection.delete("D");
        Assertions.assertEquals(3, collection.getSize());
    }
}