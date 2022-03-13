package com.ronakp.java;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashTableCustom {

    public static void main(String[] args) {
        Hashtable<Integer, String> object = new Hashtable<Integer, String>();

        object.put(1, "Hi");
        object.put(2, "Hello");
        object.put(3, "Hey");

        System.out.println(object.size()); //3

        System.out.println(object.containsKey(4)); //false
        System.out.println(object.containsKey(3)); //true

        System.out.println(object.containsValue("Hey")); //true
        System.out.println(object.containsValue("Oye")); //false

        System.out.println(object.get(1)); //Hi

        //Using keySet for loop
        Set<Integer> keys = object.keySet();
        for (Integer key : keys) {
            System.out.println(key + " : " + object.get(key));
        }

        //Using entrySet for loop
        Set<Map.Entry<Integer, String>> entry = object.entrySet();
        for (Map.Entry<Integer, String> localEntry : entry) {
            System.out.println(localEntry.getKey() + " : " + localEntry.getValue());
        }

        //Using forEach and Lambda Expression
        object.forEach((key, value) -> System.out.println(key + " : " + value));

        //Using keySet iterator
        Set<Integer> keyi = object.keySet();
        Iterator<Integer> it = keyi.iterator();
        while (it.hasNext()) {
            int next = it.next();
            System.out.println(next + " : " + object.get(next));
        }

        //Using entrySet iterator
        Set<Map.Entry<Integer, String>> entryi = object.entrySet();
        Iterator<Map.Entry<Integer, String> > iti = entryi.iterator();
        while (iti.hasNext()) {
            Map.Entry<Integer, String> localEntry = iti.next();
            System.out.println(localEntry.getKey() + " : " + localEntry.getValue());
        }
    }
}
