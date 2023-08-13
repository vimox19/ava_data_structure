package org.example;

import java.util.HashMap;
import java.util.Map;

public class TheMaps {
    public static void main(String[] args) {
        Map<Integer,Person> map = new HashMap<>();
        map.put(1,new Person("alex"));
        map.put(2,new Person("ahmed"));
        map.put(3,new Person("joo"));
        map.put(3,new Person("joo2")); //this will override the first value

        System.out.println(map);
        System.out.println(map.size());
        System.out.println(map.get(1));
        System.out.println(map.containsKey(5));
        System.out.println(map.keySet());
        System.out.println(map.entrySet());

        map.entrySet().forEach(System.out::println);
        map.entrySet().forEach(x->System.out.println(x.getKey() + " "+x.getValue()));
        map.forEach((key,person)->{
            System.out.println(key + "-" + person);
        });
        map.remove(3);
    }
     record Person(String name){}

}
