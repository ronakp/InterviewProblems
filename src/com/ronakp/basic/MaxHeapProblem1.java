package com.ronakp.basic;

import javax.naming.SizeLimitExceededException;

public class MaxHeapProblem1 {
    private int[] heap;
    private int size;
    private int capacity;

    public MaxHeapProblem1(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        heap = new int[this.capacity];
    }

    private int parentIndex(int position) {
        return (position-1)/2;
    }

    private int leftChildIndex(int position) {
        return (2*position)+1;
    }

    private int rightChildIndex(int position) {
        return (2*position)+2;
    }

    // O(Log n) It needs heapifyUp()
    public void add(int data) {

    }

    // O(1)
    public int peek() {
        return heap[0];
    }

    // O(Log n) It needs heapifyDown()
    public void poll() {

    }
}
