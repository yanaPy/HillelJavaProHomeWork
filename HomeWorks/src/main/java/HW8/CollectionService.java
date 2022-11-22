package HW8;


import java.util.Arrays;
import java.util.Objects;


public class CollectionService implements Collection {

    private final int DEFAULT_CAPACITY = 10;
    String[] elementData;
    private int customCapacity;


    public CollectionService() {
        this.elementData = new String[DEFAULT_CAPACITY];
    }

    public CollectionService(int customCapacity) {
        this.elementData = new String[customCapacity];
    }

    private int size;
    private int modCount = 0;

    @Override
    public boolean add(String o) {
        modCount++;
        String[] newArray;
        if ((elementData[elementData.length - 1]) == null) {
            elementData[elementData.length - 1] = o;

        } else {
            newArray = new String[elementData.length + 1];
            for (int i = 0, j = 0; i < newArray.length; i++, j++) {
                if (i != newArray.length - 1) {
                    newArray[j] = elementData[i];
                } else {
                    newArray[newArray.length - 1] = o;
                }
            }
            elementData = newArray;
        }
        size++;
        return true;
    }


    @Override
    public boolean add(int index, String o) {
        modCount++;
        String[] newArray = new String[elementData.length + 1];
        if (index >= elementData.length) {
            System.out.println("Array size: " + elementData.length + " but you want to add " + index + " element");
            return false;
        } else {
            for (int i = 0, j = 0; i < elementData.length; i++, j++) {
                if (i == index) {
                    newArray[j] = o;
                    j++;
                }
                newArray[j] = elementData[i];
            }
        }
        size++;
        elementData = newArray;

        return true;
    }

    public void ensureCapacity(int minCapacity) {
        if (minCapacity > elementData.length) {
            modCount++;
            int oldCapacity = elementData.length;
            int newCapacity = (oldCapacity * 3) / 2;
            String[] oldData = this.elementData;
            elementData = new String[newCapacity];
            System.arraycopy(oldData, 0, elementData, 0, size);
        }
    }


    @Override
    public boolean delete(String o) {
        for (int i = 0; i < elementData.length; i++) {
            if (Objects.equals(elementData[i], o)) {
                elementData[i] = null;
                size--;
            }
        }
        return true;
    }

    @Override
    public String get(int index) {
        return elementData[index];
    }

    @Override
    public boolean contain(String o) {
        boolean contain = false;
        if (o != null) {
            for (String elementDatum : elementData) {
                if (elementDatum != null && elementDatum.contains(o)) {
                    contain = true;
                } else contain = false;
            }
        }
        return contain;
    }


    @Override
    public boolean equals(Collection str) {
        boolean equals = false;
        final String[] es = elementData;

        for (int i = 0; i < es.length; i++) {
            if (Objects.equals(es[i], str.get(i))) {
                equals = true;
            } else equals = false;
        }
        return equals;
    }


    @Override
    public boolean clear() {
        modCount++;
        for (int i = 0; i < elementData.length; i++)
            elementData[i] = null;
        size = 0;
        return true;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public String toString() {
        return "CollectionService{" +
                "elementData=" + Arrays.toString(elementData) +
                '}';
    }
}
