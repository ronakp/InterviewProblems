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

        Iterator<String> it = object.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
