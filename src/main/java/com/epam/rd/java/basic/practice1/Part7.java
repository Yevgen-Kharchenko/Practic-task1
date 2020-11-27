package com.epam.rd.java.basic.practice1;

public class Part7 {

    public static void main(String[] args) {
        str2int(args[0]);
        int2str(Integer.parseInt(args[1]));
        rightColumn(args[2]);

    }

    public static int str2int(String number) {

        int result = 0;
        for (int i = 0; i < number.length(); i++) {
            result *= 26;
            result += number.charAt(i) - 'A' + 1;
        }
        return result;
    }

    public static String int2str(int number) {
        StringBuilder stringBuilder = new StringBuilder();
        while (number > 0) {
            if (number % 26 == 0) {
                stringBuilder.append("Z");
                number = (number / 26) - 1;
            } else {
                stringBuilder.append((char) ((number % 26 - 1) + 'A'));
                number = number / 26;
            }
        }
        stringBuilder.reverse();
        return stringBuilder.toString();
    }

    public static String rightColumn(String number) {
        int num = str2int(number);
        num++;
        String string = int2str(num);
        return string;
    }
}
