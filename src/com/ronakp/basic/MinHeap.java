package com.ronakp.basic;

import java.util.Arrays;

public class MinHeap {
    private int capacity;
    private int size;
    private int[] heap;

    private MinHeap(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        this.heap = new int[capacity];
    }

    private int leftChildIndex(int parentIndex) {
        return 2 * parentIndex + 1;
    }

    private int rightChildIndex(int parentIndex) {
        return 2 * parentIndex + 2;
    }

    private int parentIndex(int childIndex) {
        return (childIndex - 1) / 2;
    }

    private boolean hasLeftChild(int index) {
        return leftChildIndex(index) < size;
    }

    private boolean hasRightChild(int index) {
        return rightChildIndex(index) < size;
    }

    private boolean hasParent(int index) {
        return parentIndex(index) >= 0;
    }

    private int leftChild(int parentIndex) {
        return heap[leftChildIndex(parentIndex)];
    }

    private int rightChild(int parentIndex) {
        return heap[rightChildIndex(parentIndex)];
    }

    private int parent(int childIndex) {
        return heap[parentIndex(childIndex)];
    }

    private void swap(int index1, int index2) {
        int element = heap[index1];
        heap[index1] = heap[index2];
        heap[index2] = element;
    }

    // O(Log n) It needs heapifyUp()
    public void add(int data) {
        ensureCapacity();
        heap[size] = data;
        size++;
        heapifyUp();
    }

    private void ensureCapacity() {
        if (size == capacity) {
            heap = Arrays.copyOf(heap, capacity * 2);
            capacity = capacity * 2;
        }
    }

    private void heapifyUp() {
        int index = size - 1;

        while (hasParent(index) && parent(index) > heap[index]) {
            swap(parentIndex(index), index);
            index = parentIndex(index);
        }
    }

    // O(1)
    public int peek() throws Exception{
        if (size == 0) {
            throw new Exception();
        }
        return heap[0];
    }

    // O(Log n) It needs heapifyDown()
    public int poll() throws Exception {
        if (size == 0) {
            throw new Exception();
        }
    
        int element = heap[0];
        heap[0] = heap[size - 1];
        size--;
        heapifyDown();
        return element;
    }

    private void heapifyDown() {
        int index = 0;

        while (hasLeftChild(index)) {
            int smallestChildIndex = leftChildIndex(index);

            if (hasRightChild(index) && rightChild(index) < leftChild(index)) {
                smallestChildIndex = rightChildIndex(index);
            }
            if (heap[index] < heap[smallestChildIndex]) {
                break;
            } else {
                swap(index, smallestChildIndex);
            }
            index = smallestChildIndex;
        }
    }

    public void printHeap() {
        for (int i : heap) {
            System.out.print(i + " ");
        }
    }
}
