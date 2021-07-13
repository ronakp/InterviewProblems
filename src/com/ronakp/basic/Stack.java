package com.ronakp.basic;

import com.ronakp.basic.helper.Node;

public class Stack {
    Node head;

    public void push(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public int pop() {
        int data = head.data;
        head = head.next;
        return data;
    }

    public int peek() {
        return head.data;
    }

    public boolean isEmpty() {
        return head == null;
    }
}
