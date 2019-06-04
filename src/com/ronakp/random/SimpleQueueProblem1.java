package com.ronakp.random;

import com.ronakp.random.helper.Node;

public class SimpleQueueProblem1 {
    Node head; //Remove
    Node tail; //Add

    public void add(int data) {
        Node newNode = new Node(data);
        if(tail != null) {
            tail.next = newNode;
        }
        tail = newNode;
        if(head == null) {
            head = newNode;
        }
    }

    public int remove() {
        int data = head.data;
        head = head.next;
        if(head == null) {
            tail = null;
        }
        return data;
    }

    public int peek() {
        return head.data;
    }

    public boolean isEmpty() {
        return head == null;
    }
}
