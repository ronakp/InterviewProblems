package com.ronakp.java;

public class ArrayCustom {

    public static void main(String[] args) {
        int size = 5;
        int[] object = new int[size];

        object[0] = 1;
        object[1] = 2;

        System.out.println(object.length); //5

        for(int i = 0; i < object.length; i++) {
            System.out.println(object[i]);
        }

        int row = 2;
        int column = 1 ;
        int[][] object2d = new int[row][column];

        object2d[0][0] = 1;
        object2d[0][1] = 2;

        System.out.println(object2d[0].length); //column
        System.out.println(object2d.length); //row

        for(int r = 0; r < object2d.length; r++) {
            for(int c = 0; c < object2d[0].length; c++) {
                System.out.println(object2d[r][c]);
            }
        }
    }
}
