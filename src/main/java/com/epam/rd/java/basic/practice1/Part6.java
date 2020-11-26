package com.epam.rd.java.basic.practice1;

import java.util.Arrays;

public class Part6 {

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int[] array = new int[n];
        array[0] = 2;
        for (int i = 1; i < n; i++) {
            array[i] = 2 * (i + 1) - 1;
        }
        System.out.println(Arrays.toString(array));
    }

}
