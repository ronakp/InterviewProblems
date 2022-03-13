package com.ronakp.java;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapCustom {

    public static void main(String[] args) {
        HashMap<Integer, String> object = new HashMap<>();

        object.put(1, "Hi");
        object.put(2, "Hello");
        object.put(3, "Hey");

        System.out.println(object.size()); //3

        System.out.println(object.containsKey(4)); //false
        System.out.println(object.containsKey(3)); //true

        System.out.println(object.containsValue("Hey")); //true
        System.out.println(object.containsValue("Oye")); //false

        System.out.println(object.get(1)); //Hi
        
        //Using for loop
        for(Map.Entry<Integer, String> entry : object.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }

        //Using forEach and lambda expression
        object.forEach((key, value) -> System.out.println(key + " : " + value));

        //Using iterator
        Iterator<Map.Entry<Integer, String>> iterator
            = object.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Integer, String> localMap = (Map.Entry<Integer, String>) iterator.next();
            System.out.println(localMap.getKey() + " : " + localMap.getValue());
        }

        //Using stream api
        object.entrySet().stream().forEach(input-> System.out.println(input.getKey() + " : " + input.getValue()));
    }
}
