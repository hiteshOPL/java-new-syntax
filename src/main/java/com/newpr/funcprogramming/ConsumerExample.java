package com.newpr.funcprogramming;

import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
        Consumer<String> consumer = s -> System.out.println(s.length() + " -> the value of x : " + s);

        consumer.accept("Test String");
    }
}
