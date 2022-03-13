package com.ronakp.java;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetCustom {

    public static void main(String[] args) {
        HashSet<String> object = new HashSet<String>();

        object.add("Hello");
        object.add("Hi");
        System.out.println(object); //[Hi, Hello]

        object.add("Hi");
        System.out.println(object); //[Hi, Hello]

        System.out.println(object.contains("Hi")); //true

        object.remove("Hi");
        System.out.println(object); //[Hello]

        //Using for loop
        for (String element : object) {
            System.out.println(element);
        }

        //Using forEach and lambda expression
        object.forEach((value) -> System.out.println(value));

        //Using iterator
        Iterator<String> it = object.iterator();
        while (it.hasNext()) {
            String localValue = it.next();
            System.out.println(localValue);
        }
    }
}
