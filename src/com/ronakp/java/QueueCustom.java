package com.ronakp.java;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class QueueCustom {
    public static void main(String[] args) {
        Queue<Integer> object = new LinkedList<Integer>();

        object.add(1);
        object.add(2);
        object.add(3);
        object.add(4);
        System.out.println(object); //[1, 2, 3, 4]

        System.out.println(object.element());
        System.out.println(object.peek());

        object.remove();
        System.out.println(object);

        object.poll();
        System.out.println(object);

        System.out.println("Simple for");
        for (Integer item: object) {
            System.out.println(item);
        }

        System.out.println("Iterator");
        Iterator it = object.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
