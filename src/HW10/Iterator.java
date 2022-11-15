package HW10;


import HW8.Collection;

import java.util.NoSuchElementException;

public class Iterator implements java.util.Iterator {
    private int cursor;
    private Collection collection;

    public Iterator(Collection collection) {
        this.collection = collection;
    }

    @Override
    public boolean hasNext() {
        return cursor < collection.size();
    }

    @Override
    public String next() {
        int i = cursor;
        if (i >= collection.size()) {
            throw new NoSuchElementException();
        }
        cursor = i + 1;
        return collection.get(i);
    }
}
