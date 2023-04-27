package com.newpr.funcprogramming;

import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {
        Function<Integer, Double> sqrt = n -> Math.sqrt(n);
        System.out.println("64 : " + sqrt.apply(64));
        System.out.println("81 : " + sqrt.apply(81));

        Function<String, String> lowercaseFunction = s -> s.toLowerCase();
        System.out.println(lowercaseFunction.apply("SDDDD SDDDDDDWEWEE"));

        Function<String, String> concatFunction = s -> s.concat("In Java");
        System.out.println(lowercaseFunction.andThen(concatFunction).apply("PROGRAMMING "));
        System.out.println(lowercaseFunction.compose(concatFunction).apply("PROGRAMMING "));
    }
}
