package com.epam.rd.java.basic.practice1;

public class Part7 {

    public static void main(String[] args) {
        if (args != null) {
            System.out.print(str2int(args[0]));
            System.out.print(int2str(Integer.parseInt(args[1])));
            System.out.print(rightColumn(args[2]));
        } else {
            System.out.print("A ==> 1 ==> A\n" +
                    "B ==> 2 ==> B\n" +
                    "Z ==> 26 ==> Z\n" +
                    "AA ==> 27 ==> AA\n" +
                    "AZ ==> 52 ==> AZ\n" +
                    "BA ==> 53 ==> BA\n" +
                    "ZZ ==> 702 ==> ZZ\n" +
                    "AAA ==> 703 ==> AAA\n");
        }

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
