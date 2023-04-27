package com.newpr.lambda;

public class ConcatenateNew {
    public static void main(String[] args) {
        ConcatenateInterface concatenateInterface = (a, b) -> a + " " + b;
        System.out.println(concatenateInterface.sconcat("232323", "dfdfdfdf"));
    }
}
