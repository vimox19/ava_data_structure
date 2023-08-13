package org.example;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class TheQueues {
    public static void main(String[] args) {
        Queue<Person> supermarket = new LinkedList<>();
        LinkedList<Person> supermarketL = new LinkedList<>();
        supermarket.add(new Person("alex",23));
        supermarket.add(new Person("ahmed",23));
        supermarket.add(new Person("ali",12));
        System.out.println(supermarket.size());
        System.out.println(supermarket.peek());
        System.out.println(supermarket.poll()); //or remove
        System.out.println(supermarket.size());



    }
    static record Person(String name,int age ){}


}
