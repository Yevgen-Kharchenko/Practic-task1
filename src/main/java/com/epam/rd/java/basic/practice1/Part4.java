package com.epam.rd.java.basic.practice1;

public class Part4 {

    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);

        if (x < y) {
            int number = x;
            x = y;
            y = number;
        }
        int res;

        do {
            res = x % y;
            x = y;
            y = res;
        } while (res != 0);

        System.out.print(x);
    }
}
