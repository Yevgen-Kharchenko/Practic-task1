package com.epam.rd.java.basic.practice1;

public class Part5 {

    public static void main(String[] args) {
        String string = args[0];
        int sum = 0;
        char[] ch = string.toCharArray();
        for (char element : ch) {
            int num = Integer.parseInt(String.valueOf(element));
            sum += num;

        }
        System.out.print(sum);

    }

}
