package com.michaelhope;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache<K, V> {

    private final int capacity;
    private final Map<K, V> cache;

    public LRUCache(int capacity) {
        this.capacity = capacity;

        this.cache = Collections.synchronizedMap(
                new LinkedHashMap<K, V>(capacity, 0.75f, true) {

                    @Override
                    protected boolean removeEldestEntry(
                            Map.Entry<K, V> eldest) {
                        return size() > capacity;
                    }
                }
        );
    }

    public V get(K key) {
        return cache.get(key);
    }

    public void put(K key, V value) {
        cache.put(key, value);
    }

    public int size() {
        return cache.size();
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
} // use Caffeine cache lib in production
