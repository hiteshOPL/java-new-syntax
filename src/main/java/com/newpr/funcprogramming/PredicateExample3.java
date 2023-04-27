package com.newpr.funcprogramming;

import java.util.function.DoublePredicate;
import java.util.function.IntPredicate;
import java.util.function.LongPredicate;

public class PredicateExample3 {
    public static void main(String[] args) {
        IntPredicate p1 = i -> i > 100;
        System.out.println(p1.test(100));

        System.out.println("---------------------");

        LongPredicate p2 = i -> i > 100L;
        System.out.println(p2.test(111111111111L));

        System.out.println("---------------------");

        DoublePredicate p3 = i -> i > 100.10;
        DoublePredicate p4 = i -> i < 100.35;
        System.out.println(p3.and(p4).test(100.25));
    }
}
