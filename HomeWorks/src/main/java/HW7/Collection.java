package HW7;

import lombok.Data;

import java.util.Arrays;

@Data
public class Collection {

    String[] array;

    private int modCount = 0;
    int size;

    public Collection(String[] array) {
        this.array = array;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null) {
                size++;
            }
        }
    }

    public Collection() {
        this.array = new String[0];
    }


    //    1. boolean add(int index, String value);
    public boolean add(int index, String value) {
        modCount++;
        String[] newArray = new String[array.length + 1];
        if (index > array.length) {
            System.out.println("Array size: " + array.length + " but you want to add " + index + " element");
            return false;
        } else {
            for (int i = 0, j = 0; i < array.length; i++, j++) {
                if (i == index) {
                    newArray[j] = value;
                    j++;
                }
                newArray[j] = array[i];
            }
        }
        array = newArray;
        size++;
        return true;
    }


    //2. boolean add(String value);
    public boolean add(String value) {
        modCount++;
        String[] newArray = new String[array.length + 1];

        for (int i = 0, j = 0; i < newArray.length; i++, j++) {
            if (i != newArray.length - 1) {
                newArray[j] = array[i];
            } else {
                newArray[newArray.length - 1] = value;
            }
        }
        array = newArray;
        size++;
        return true;
    }

    //    3. boolean delete(int index);
    public boolean delete(int index) {
        modCount++;
        String[] newArray = new String[array.length - 1];
        if (index >= array.length) {
            System.out.println("Array size: " + array.length + " but you want to delete " + index + " element");
            return false;
        } else {
            for (int i = 0, j = 0; i < newArray.length; i++, j++) {
                if (i == index) {
                    i++;
                }
                newArray[j] = array[i];
            }
            size--;
        }
        array = newArray;
        return true;
    }

    //4. boolean delete(String value);
    public boolean delete(String value) {
        Boolean isDeleted=false;
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(value)) {
                array[i] = null;
                isDeleted=true;

            }

        }
        size--;
        return isDeleted;
    }

    //5. String get(int index);
    public String get(int index) {
        return array[index];
    }


    @Override
    public String toString() {
        return "Collection{" +
                "array=" + Arrays.toString(array) +
                '}';
    }

    public int size() {
        return size;
    }
}
