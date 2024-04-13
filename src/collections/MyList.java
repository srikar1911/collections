package collections;


import java.util.AbstractList;

public class MyList<E> extends AbstractList {

    private Object[] objArray = new Object[10];

    private int elementCount = 0;

    //method to increase the array size when elementCount == array Length
    private void increaseCapacity() {

        int newCapacity = objArray.length * 2;           // creating a variable which decides the capacity of new array
        Object[] newArray = new Object[newCapacity];     // creating a new array with new capacity

        for (int i = 0; i < objArray.length; i++) {      // copying the elements of old array into new array
            newArray[i] = objArray[i];
        }

        objArray = newArray;                             // referencing the new array and garbage collecting old array
    }

    // method to add an object, it internally uses increaseCapacity method
    public boolean add(Object obj) {
        if (elementCount == objArray.length) {           //checking the size of array
            increaseCapacity();
        }
        objArray[elementCount] = obj;                    //adding new element at the last index
        elementCount++;                                  // incrementing the index
        return true;
    }

    //method to return current size of array
    public int size() {
        return elementCount;
    }

    //method to return current capacity of the array
    public int capacity() {
        return objArray.length;
    }

    //method to return an object at the requested index
    public Object get(int index) {
        if (index < 0 || index >= size())           //checking if index is not in range of size
            throw new IndexOutOfBoundsException("Element at the given index doesn't exist");
        return objArray[index];
    }


}
