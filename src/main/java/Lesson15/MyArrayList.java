package Lesson15;

public class MyArrayList<T> {
    private Object[] array;
    int size;

    public MyArrayList() {
        size = 0;
        array = new Object[size];
    }

    public MyArrayList(int size) {
        this.size = 0;
        array = new Object[size];
    }

    public boolean add(T data) {

        if (array.length == size) {
            int newSize = size != 0 ? size * 2 : 10;

            Object[] tempArray = new Object[newSize];
            System.arraycopy(array, 0, tempArray, 0, size);
            array = tempArray;
        }
        array[size] = data;
        size++;
        return true;
    }

    public boolean remove(T data) {
        for (int i = 0; i < size; i++) {
            if (data.equals(array[i])) {
                Object[] tempArray = new Object[size];
                System.arraycopy(array, 0, tempArray, 0, i);
                System.arraycopy(array, i + 1, tempArray, i, size - i - 1);
                array = tempArray;
                size--;
                return true;
            }
        }
        return false;
    }

    public int size() {
        return size;
    }

    public T get(int index) {
        if (index < size && index >= 0)
            return (T) array[index];
        else
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void clear() {
        array = new Object[0];
        size = 0;
    }

    public boolean contains(T data) {
        for (int i = 0; i < size; i++) {
            if (array[i].equals(data))
                return true;
        }
        return false;
    }

    @Override
    public String toString() {
        StringBuilder arrayString = new StringBuilder();
        arrayString.append("[ ");
        for (int i = 0; i < size; i++) {
            arrayString.append(array[i]).append(" ");
        }
        arrayString.append("]");
        return arrayString.toString();
    }

}
