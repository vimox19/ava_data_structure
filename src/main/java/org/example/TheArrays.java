package org.example;

import java.util.Arrays;

public class TheArrays {
    public static void main(String[] args) {
        String[] colors = new String[5]; //capacity
        colors[0] = "purple";
        colors[1] = "blue";
        //System.out.println(colors); will print the array as object
        System.out.println(Arrays.toString(colors));
        int[] num = new int[2];
        int[] nums= {100,200};


        //looping on arrays

        for (int i = 0; i < colors.length; i++) {
            System.out.println(colors[i]);
        }

        for(String color:colors){
            System.out.println(color);
        }

        Arrays.stream(colors).forEach(System.out::println);

    }
}
