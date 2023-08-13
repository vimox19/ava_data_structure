package org.example;

import java.util.ArrayList;
import java.util.List;

public class TheLists {
    public static void main(String[] args) {
        //list can contain any type of data but its better to fix the type with <type>
        List<String> unchanged = List.of(
                "balck",
                "red"
        );//immutable list we cant change it
        List<String> colors = new ArrayList<>(); // ArrayList here is just an implementation we can change it
        colors.add("blue");
        colors.add("purple");

        System.out.println(colors.size());
        System.out.println(colors.contains("blue"));
        System.out.println(colors);

        //lopping
        for (String color : colors){
            System.out.println(color);
        }

        colors.forEach(System.out::println);

        for (int i = 0; i < colors.size(); i++) {
            System.out.println(colors.get(i));

        }

    }
}
