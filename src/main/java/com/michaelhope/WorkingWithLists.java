package com.michaelhope;

import java.util.ArrayList;
import java.util.List;

public class WorkingWithLists {
    public static void main(String[] args) {
        List<String> colors = new ArrayList<>();
        colors.add("blue");
        colors.add("purple");
        colors.add("yellow");

        System.out.println(colors.size());
        System.out.println(colors);
        System.out.println(colors.contains("yellows"));

        colors.add(0, "pink");
        System.out.println(colors);

        for(int i=0; i<colors.size(); i++) {
            System.out.println(colors.get(i));
        }
        System.out.println();

        for (String color : colors) {
            System.out.println(color);
        }
        System.out.println();

        colors.forEach(System.out::println);

        // immutable list
        List<String> unmodifiableList =  List.of("yelow", "blue", "red");
        System.out.println(unmodifiableList);
    }
}
