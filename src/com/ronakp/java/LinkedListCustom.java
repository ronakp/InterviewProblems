package com.ronakp.java;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListCustom {

    public static void main(String[] args) {
        LinkedList<String> object = new LinkedList<String>();

        object.add("Hello");
        object.add("Hi");
        System.out.println(object); //[Hello, Hi]

        object.clear();
        System.out.println(object); //[]

        object.add(0, "Hey");
        object.add(1, "Oye");
        System.out.println(object); //[Hey, Oye]

        System.out.println(object.size()); //2

        Object[] a = object.toArray();
        System.out.println(a.length); //2

        System.out.println(object.contains("Hey")); //true

        object.remove("Hey");
        System.out.println(object); //[Oye]

        object.add("Hi");
        object.add("Hello");
        object.add("Hey");

        System.out.println("Simple for");
        for(int i = 0; i < object.size(); i++) {
            System.out.println(object.get(i));
        }

        System.out.println("Advance for");
        for(String str : object) {
            System.out.println(str);
        }

        System.out.println("Iterator");
        Iterator<String> it = object.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
