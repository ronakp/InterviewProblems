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
            public int compare(Integer n1, Integer n2) {
                return n1<=n2 ? n2 : n1;
            }
        };

        PriorityQueue<Integer> pqInt = new PriorityQueue<>(comparator);

        pqInt.add(3);
        pqInt.add(1);
        pqInt.add(2);

        System.out.println(pqInt);

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());

        maxHeap.add(6);
        maxHeap.add(9);
        maxHeap.add(5);
        maxHeap.add(64);
        maxHeap.add(6);

        System.out.println(maxHeap);

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        minHeap.add(6);
        minHeap.add(9);
        minHeap.add(5);
        minHeap.add(64);
        minHeap.add(6);

        System.out.println(minHeap);
    }
}
