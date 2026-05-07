package com.michaelhope;

import java.util.Arrays;

public class WorkingWithArrays {
    public static void main(String[] args) {
        String[] colours = new String[3];
        colours[0] = "red";
        colours[1] = "blue";
        colours[2] = "green";
        System.out.println(Arrays.toString(colours));

        colours[2] = "yellow";
        System.out.println(Arrays.toString(colours));

        int[] numbers = {0, 1, 2};
        for (int number : numbers) {
            System.out.println(number);
        }
        System.out.println();

        for(int i=0; i < numbers.length; i++){
            System.out.println(i);
        }
        System.out.println();

        Arrays.stream(colours).forEach(System.out::println);

    }
}
