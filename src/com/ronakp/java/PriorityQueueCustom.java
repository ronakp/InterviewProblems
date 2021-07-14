package com.ronakp.java;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueCustom {

    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.add(78);
        pq.add(30);
        pq.add(89);

        Iterator<Integer> it = pq.iterator();
        
        while(it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println(pq); //[30, 78, 89]

        System.out.println(pq.peek()); //30
        System.out.println(pq.poll()); //30
    }
}
