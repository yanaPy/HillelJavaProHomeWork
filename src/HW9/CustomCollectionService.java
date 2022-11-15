package HW9;

import java.util.Arrays;

public class CustomCollectionService<String> implements CustomCollection<String> {

    private final int DEFAULT_CAPACITY = 10;
    Object[] elementData;
    private int customCapacity;

    private int size;
    private int modCount = 0;

    private CustomCollectionService.Node<String> first;
    private CustomCollectionService.Node<String> last;

    public CustomCollectionService() {
        this.last = new Node<String>(null, first, null);
        this.first = new Node<String>(null, null, last);
    }

    @Override
    public boolean add(String str) {
//        lastReturned = null;
//        if (next == null)
//            linkLast(e);
//        else
//            linkBefore(e, next);
//        nextIndex++;
//        expectedModCount++;

        modCount++;
        Object[] newArray = new Object[elementData.length + 1];

        for (int i = 0, j = 0; i < newArray.length; i++, j++) {
            if (i != newArray.length - 1) {
                newArray[j] = elementData[i];
            } else {
                newArray[newArray.length - 1] = str;
            }
        }
        elementData = newArray;
        size++;
        return true;
    }

    @Override
    public boolean addAll(CustomCollection strColl) {
//        Object[] a = strColl.toArray();
//        Object[] newArr = strColl.toString();
//
//        modCount++;
//        int numNew = newArr.length;
//        if (numNew == 0)
//            return false;
//        Object[] elementData;
//        final int s;
//        if (numNew > (elementData = this.elementData).length - (s = size))
//            elementData = grow(s + numNew);
//        System.arraycopy(new, 0, elementData, s, numNew);
//        size = s + numNew;
        return true;    }

    @Override
    public boolean delete(int index) {
        modCount++;
        Object[] newArray = new Object[elementData.length - 1];
        if (index >= elementData.length) {
            System.out.println("Array size: " + elementData.length + " but you want to delete " + index + " element");
            return false;
        } else {
            for (int i = 0, j = 0; i < newArray.length; i++, j++) {
                if (i == index) {
                    i++;
                }
                newArray[j] = elementData[i];
            }
        }
        elementData = newArray;
        return true;
    }

    @Override
    public boolean delete(String str) {
        for (int i = 0; i < elementData.length; i++) {
            if (elementData[i] == str) {
                elementData[i] = null;
                size--;
            }
        }
        return true;
    }

    @Override
    public String get(int index) {
        return (String) elementData[index];
    }

    @Override
    public boolean contains(String str) {
        boolean contain = false;
        if (str != null) {
            for (int i = 0; i < elementData.length; i++) {
                if (elementData[i] != null && elementData[i] == (str)) {
                    contain = true;
                } else contain = false;
            }
        }
        return contain;
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
    public boolean trim() {
        return true;
    }

    @Override
    public java.lang.String toString() {
        return "CustomCollectionService{" +
                "elementData=" + Arrays.toString(elementData) +
                ", first=" + first +
                ", last=" + last +
                '}';
    }

    //
//    @Override
//    public boolean addAll(Collection strColl) {
////        Object[] a = strColl.toArray();
//        Object[] a = strColl[];
//
//        modCount++;
//        int numNew = a.length;
//        if (numNew == 0)
//            return false;
//        Object[] elementData;
//        final int s;
//        if (numNew > (elementData = this.elementData).length - (s = size))
//            elementData = grow(s + numNew);
//        System.arraycopy(a, 0, elementData, s, numNew);
//        size = s + numNew;
//        return true;
//    }
//


    private static class Node<String> {
        private String current;

        private CustomCollectionService.Node<String> next;
        private CustomCollectionService.Node<String> prev;

        private int nextIndex;

        private Node(String current, CustomCollectionService.Node<String> prev, CustomCollectionService.Node<String> next) {
            this.current = current;
            this.next = next;
            this.prev = prev;
        }

    }
}
