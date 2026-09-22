package com.michaelhope;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache<K, V> extends LinkedHashMap<K, V> {

    private final int capacity;

    public LRUCache(int capacity) {
        // 0.75f is used because 0.75 is the default load factor chosen for HashMap/LinkedHashMap
        // as a trade-off between memory usage and lookup performance.
        super(capacity, 0.75f, true); // true = access order
        this.capacity = capacity;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        // size() is an instance method inherited from LinkedHashMap
        return size() > capacity;
    }

    public static void main(String[] args) {
        LRUCache<Integer, String> cache = new LRUCache<>(3);

        cache.put(1, "A");
        cache.put(2, "B");
        cache.put(3, "C");

        System.out.println(cache);
        // {1=A, 2=B, 3=C}

        cache.get(1); // 1 was recently used

        cache.put(4, "D"); // removes 2

        System.out.println(cache);
        // {3=C, 1=A, 4=D}
    }
}
