package Task2_1;

import java.util.LinkedList;

public class CustomHashSet<T> {

    private static final int INITIAL_CAPACITY = 16;
    private LinkedList<T>[] buckets;
    private int size;

    public CustomHashSet() {
        buckets = new LinkedList[INITIAL_CAPACITY];
        for (int i = 0 ; i < INITIAL_CAPACITY; i++) {
            buckets[i] = new LinkedList<>();
        }
    }

    private int getBucketIndex(T key) {
        return key.hashCode() % buckets.length;
    }

    public void add(T key) {
        int index = getBucketIndex(key);
        LinkedList<T> bucket = buckets[index];
        if (!bucket.contains(key)) {
            bucket.add(key);
            size++;
        }
    }

    public void remove(T key) {
        int index = getBucketIndex(key);
        LinkedList<T> bucket = buckets[index];
        if (bucket.contains(key)) {
            bucket.remove(key);
            size--;
        }
    }

    public boolean contains(T key) {
        int index = getBucketIndex(key);
        LinkedList<T> bucket = buckets[index];
        return bucket.contains(key);
    }

    public int size() {
        return size;
    }
}
