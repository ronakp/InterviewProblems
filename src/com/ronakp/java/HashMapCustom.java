package com.ronakp.java;

import java.util.HashMap;
import java.util.Map;

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

        for(Map.Entry<Integer, String> entry : object.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
    }
}
