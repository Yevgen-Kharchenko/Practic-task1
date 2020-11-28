package com.epam.rd.java.basic.practice1;


public class Part6 {

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        if (n != 0) {
            int[] array = new int[n];
            array[0] = 2;
            for (int i = 1; i < n; i++) {
                array[i] = 2 * (i + 1) - 1;
            }
            int iMax = array.length - 1;
            if (iMax == -1) {
                System.out.print("[]");
            }
            StringBuilder b = new StringBuilder();
            b.append('[');
            for (int i = 0; i < array.length; i++) {
                b.append(array[i]);
                if (i == iMax) {
                    System.out.print(b.append(']').toString());
                }
                b.append(" ");
            }

        }

    }

}
