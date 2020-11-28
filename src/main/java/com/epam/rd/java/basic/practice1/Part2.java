package com.epam.rd.java.basic.practice1;

public class Part2 {

    public static void main(String[] args) {
        int x = 0;
        for (String string : args) {
            x = x + Integer.parseInt(string);
        }
        System.out.print(x);
    }
}
