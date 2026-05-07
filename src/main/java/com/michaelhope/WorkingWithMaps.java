package com.michaelhope;

import java.util.HashMap;
import java.util.Map;

public class WorkingWithMaps {
    public static void main(String[] args) {
        Map<Integer, Person> map = new HashMap<>();
        map.put(1, new Person("Alex"));
        map.put(2, new Person("Alexa"));
        map.put(3, new Person("Mariam"));
        map.put(3, new Person("Mariam 2"));

        System.out.println(map.size());
        System.out.println(map);
        System.out.println(map.get(1));
        System.out.println(map.containsKey(4));
        System.out.println(map.keySet());
        System.out.println(map.entrySet());
        map.remove(1);
        map.getOrDefault(100, new Person("Default"));
        System.out.println();

        map.forEach((key, value) -> System.out.println(key + " - " + value));
    }

    record Person(String name) {}
}
