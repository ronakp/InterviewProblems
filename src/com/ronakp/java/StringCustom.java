package com.ronakp.java;

public class StringCustom {

    public static void main(String[] args) {
        String object = "Hello";
        for(int i = 0; i < object.length(); i++) {
            char a = object.charAt(i);
            System.out.println(a);
        }

        char[] charObject = { 'H', 'I' };
        String stringObject = new String(charObject);
        System.out.println(stringObject);
    }
}
