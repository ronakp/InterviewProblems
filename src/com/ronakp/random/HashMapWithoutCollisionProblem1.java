package com.ronakp.random;

public class HashMapWithoutCollisionProblem1<K, V> {
    private int size = 30;
    private V[] dataStore = (V[]) new Object[size];

    public void put(K Key, V Value) {
        if(Key == null) {
            throw new NullPointerException();
        }
        int index = hash(Key.hashCode()) % size;
        dataStore[index] = Value;
    }

    public V get(K Key) {
        int index = hash(Key.hashCode()) % size;
        return dataStore[index];
    }

    private int hash(int Key) {
        Key ^= (Key >>> 20) ^ (Key >>> 12);
        return Key^(Key >>> 7) ^ (Key >>> 4);
    }
}
