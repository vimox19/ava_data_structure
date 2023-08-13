package org.example;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TheSets {
    public static void main(String[] args) {
        Set<Ball> balls =  new HashSet<>();// or treeSet() && set are not ordered and dont allow duplicate
        balls.add(new Ball("blue"));
        balls.add(new Ball("black"));
        balls.add(new Ball("black"));
        balls.add(new Ball("red"));
        System.out.println(balls.size());
        balls.forEach(System.out::println);


    }

     record Ball(String color){}

}
