package com.newpr.funcprogramming;

import java.util.Comparator;
import java.util.function.BinaryOperator;
import java.util.function.DoubleBinaryOperator;
import java.util.function.IntBinaryOperator;
import java.util.function.LongBinaryOperator;

public class BinaryOperatorExample {
    public static void main(String[] args) {
        BinaryOperator<Integer> binaryOperator = (a, b) -> a + b;
        System.out.println(binaryOperator.apply(3, 4));

        Comparator<Integer> comparator = (a, b) -> a.compareTo(b);

        BinaryOperator<Integer> maxBi = BinaryOperator.maxBy(comparator);
        System.out.println(maxBi.apply(7,3));

        BinaryOperator<Integer> minBi = BinaryOperator.minBy(comparator);
        System.out.println(minBi.apply(7,3));

        IntBinaryOperator intBinaryOperator = (a, b) -> a + b;
        System.out.println(intBinaryOperator.applyAsInt(4, 4));

        LongBinaryOperator longBinaryOperator = (a, b) -> a + b;
        System.out.println(longBinaryOperator.applyAsLong(5, 4));

        DoubleBinaryOperator doubleBinaryOperator = (a, b) -> a + b;
        System.out.println(doubleBinaryOperator.applyAsDouble(6, 4));
    }
}
