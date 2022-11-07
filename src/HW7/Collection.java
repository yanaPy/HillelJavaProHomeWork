package HW7;

public class Collection {

    //    1. boolean add(int index, String value);
    public boolean add(String[] arr, int index, String value) {
        if (rangeCheckForAdd(arr, index) == true) {
            arr = new String[index+1];
            arr[index] = value;
//        add(index, value);
        }
        return true;
    }

//    private void add(String[] arr, int index, String value) {
//        if (s == elementData.length)
//            elementData = grow();
//        elementData[s] = e;
//        size = s + 1;
//    }

//    //2. boolean add(String value);
//    public boolean add(String[] arr,String value) {
//        if (rangeCheckForAdd(arr,);)
//        checkForComodification();
//        root.add(offset + index, element);
//        updateSizeAndModCount(1);
//        add(value);
//        return true;
//    }

    //3. boolean delete(int index);
//    public boolean delete(int index) {
////        Objects.checkIndex(index, size);
////        final Object[] es = elementData;
////
////        @SuppressWarnings("unchecked") E oldValue = (E) es[index];
////        fastRemove(es, index);
////
//        return get();
    //   }

    //4. boolean delete(String value);
//5. String get(int index);
    public static String get(String[] arr, int index) {
//            Objects.checkIndex(index, size);
//            return elementData(index);

        return arr[index];
    }

    private boolean rangeCheckForAdd(String[] arr, int index) {
        if (index > arr.length || index < 0) {
            System.out.println("Index: " + index + ", Size: " + arr.length);
            return true;
        } else return false;
    }
}
