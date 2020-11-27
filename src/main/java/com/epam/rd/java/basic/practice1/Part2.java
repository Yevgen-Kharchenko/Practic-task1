package com.epam.rd.java.basic.practice1;

public class Part2 {

    public static void main(String[] args) {
        int x = 0;
        for (int i = 0; i < args.length - 1; i++) {
           x = x + Integer.parseInt(args[i]);
        }


    }

}
