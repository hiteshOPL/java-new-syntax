package com.newpr.progs;

public class PalindromeString {

    public static void main(String[] args) {
        String str = "Radar";
        String rvsStr = str;

        int length = str.length();

        for (int i = (length - 1); i >= 0 ; --i) {
            rvsStr = rvsStr + str.charAt(i);
        }

        if (str.equalsIgnoreCase(rvsStr)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
