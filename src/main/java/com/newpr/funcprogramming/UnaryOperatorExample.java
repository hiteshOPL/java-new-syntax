package com.newpr.funcprogramming;

import java.util.function.*;

public class UnaryOperatorExample {
    public static void main(String[] args) {
        UnaryOperator<Integer> unary = i -> i * 10;
        System.out.println(unary.apply(15));

        Function<Integer, Integer> function = i -> i*10;
        System.out.println(function.apply(15));

        IntUnaryOperator intUnaryOperator = i -> i + 10;
        System.out.println(intUnaryOperator.applyAsInt(55));

        LongUnaryOperator longUnaryOperator = i -> i + 10;
        System.out.println(longUnaryOperator.applyAsLong(555555555555555555l));

        DoubleUnaryOperator doubleUnaryOperator = i -> i + 10;
        System.out.println(doubleUnaryOperator.applyAsDouble(4444.0));
    }
}
