package com.ronakp.basic;

public class BinarySearch {
    int[] input;

    public BinarySearch(int capacity) {
        this.input = new int[capacity];
    }

    public int binarySearchIterative(int target) {
        int first = 0;
        int last = input.length - 1;
        int mid = (first + last) / 2;
        while(first <= last) {
            if(input[mid] < target) {
                first = mid+1;
            } else if (input[mid] == target) {
                return mid;
            } else {
                last = mid - 1;
            }
            mid = (first + last) / 2;
        }
        return -1;
    }

    public int binarySearchRecursive(int target) {
        int first = 0;
        int last = input.length - 1;
        return binarySearchRecursiveHelper(first, last, target);
    }

    private int binarySearchRecursiveHelper(int first, int last, int target) {
        if(first <= last) {
            int mid = (first + last) / 2;
            if(input[mid] == target) {
                return mid;
            }
            if(input[mid] > target) {
                return binarySearchRecursiveHelper(first, mid - 1, target);
            } else {
                return binarySearchRecursiveHelper(mid + 1, last, target);
            }
        }
        return -1;
    }
}
