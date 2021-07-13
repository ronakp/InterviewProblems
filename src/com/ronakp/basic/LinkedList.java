package com.ronakp.basic;

import com.ronakp.basic.helper.Node;

public class LinkedList {
    private Node head;

    public void append(int data) {
        if (head.next == null) {
            head.next = new Node(data);
            return;
        }
        Node current = head;
        while(current.next != null) {
            current = current.next;
        }
        current.next = new Node(data);
    }

    public void prepend(int data) {
        Node newNode = new Node(data);
        newNode.next = head.next;
        head.next = newNode;
    }

    public void delete(int data) {
        if (head.next == null) {
            return;
        }
        if(head.data == data) {
            head = head.next;
            return;
        }
        Node current = head;
        while (current.next != null) {
            if(current.next.data == data)
            {
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }
    }
}
