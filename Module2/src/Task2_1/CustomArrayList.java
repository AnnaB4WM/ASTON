package Task2_1;

import java.util.Arrays;

public class CustomArrayList {

    private static final int DEFAULT_CAPACITY = 10;
    private Object[] elements;
    private int size;

    public CustomArrayList() {
        elements = new Object[DEFAULT_CAPACITY];
        size = 0;
    }

    public boolean add(Object e) {
        if (size == elements.length) {
            elements = Arrays.copyOf(elements, 2 * elements.length + 1);
        }
        elements[size++] = e;
        return true;
    }

    public boolean addAll(Object[] e) {
        if (size == elements.length) {
            elements = Arrays.copyOf(elements, 2 * elements.length + 1);
        }
        for (int i = 0; i < e.length; i++) {
            elements[size] = e[i];
            size++;
        }
        return true;
    }

    public Object get(int index) {
        checkIndex(index);
        return elements[index];
    }

    public boolean remove(int index) {
        checkIndex(index);
        for (int i = index; i < size; i++) {
            elements[i] = elements[i + 1];
            size--;
        }
        return true;
    }

    public void checkIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
    }

    @Override
    public String toString() {
        return Arrays.toString(Arrays.copyOf(elements, size));
    }
}
