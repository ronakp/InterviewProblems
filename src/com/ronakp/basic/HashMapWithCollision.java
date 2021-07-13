package com.ronakp.basic;

import java.util.LinkedList;

public class HashMapWithCollision<K, V> {
    /**
     * Closed Addressing Solution
     * Chaining
     * */
    private int size = 30;
    private LinkedList<V>[] dataStore = (LinkedList<V>[]) new Object[size];

    public void put(K Key, V Value) {
        if(Key == null) {
            throw new NullPointerException();
        }
        int index = hash(Key.hashCode()) % size;
        dataStore[index].add(Value);
    }

    public LinkedList<V> get(K Key) {
        int index = hash(Key.hashCode()) % size;
        return dataStore[index];
    }

    private int hash(int Key) {
        Key ^= (Key >>> 20) ^ (Key >>> 12);
        return Key^(Key >>> 7) ^ (Key >>> 4);
    }
}
