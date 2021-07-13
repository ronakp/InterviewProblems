package com.ronakp.java;

import java.util.Iterator;
import java.util.Stack;

public class StackCustom {
    public static void main(String[] args) {
        Stack<Integer> object = new Stack<Integer>();

        object.push(1);
        object.push(2);
        object.push(3);
        object.push(4);

        System.out.println(object); //[1, 2, 3, 4]

        System.out.println(object.peek()); //4

        System.out.println(object.pop()); //4
        System.out.println(object); //[1, 2, 3]

        System.out.println(object.search(3)); //1 Index of Element

        System.out.println("Simple for"); // Print form bottom of the Stack
        for (Integer item: object) {
            System.out.println(item);
        }

        System.out.println("Iterator"); // Print form bottom of the Stack
        Iterator<Integer> it = object.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
