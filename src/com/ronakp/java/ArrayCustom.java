package com.ronakp.java;

public class ArrayCustom {

    public static void main(String[] args) {
        int size = 30;
        int[] object = new int[size];

        object[0] = 1;
        object[1] = 2;

        System.out.println(object.length); //30

        for(int i = 0; i < object.length; i++) {
            System.out.println(object[i]);
        }
    }
}
