package com.ronakp.java;

import java.util.Comparator;
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

        Comparator<Integer> comparator = new Comparator<Integer>() {

            @Override
            public int compare(int n1, int n2) {
                return n1<=n2 ? n2 : n1;
            }
        };

        PriorityQueue<Integer> pqInt = new PriorityQueue<>(comparator);

        pqInt.add(78);
        pqInt.add(30);
        pqInt.add(89);

        System.out.println(pqInt);
    }
}
