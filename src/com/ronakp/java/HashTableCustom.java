package com.ronakp.java;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

public class HashTableCustom {

    public static void main(String[] args) {
        Hashtable<Integer, String> object = new Hashtable<>();

        object.put(1, "Hi");
        object.put(2, "Hello");
        object.put(3, "Hey");

        System.out.println(object.size()); //3

        System.out.println(object.containsKey(4)); //false
        System.out.println(object.containsKey(3)); //true

        System.out.println(object.containsValue("Hey")); //true
        System.out.println(object.containsValue("Oye")); //false

        System.out.println(object.get(1)); //Hi

        Set<Integer> keys = object.keySet();
        Iterator<Integer> it = keys.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

    }
}
