package com.epam.rd.java.basic.practice1;


public class Part6 {

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        if (n != 0) {
            int[] array = new int[n];
            array[0] = 2;
            int count = 1;
            int num = 3;
            while (count < n) {
                if (isPrime(num)) {
                    array[count] = num;
                    count++;
                }
                num++;
            }

            int iMax = array.length - 1;
            StringBuilder b = new StringBuilder();

            for (int i = 0; i < array.length; i++) {
                b.append(array[i]);
                if (i == iMax) {
                    System.out.print(b.toString());
                }
                b.append(" ");
            }

        }

    }

    private static boolean isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}

