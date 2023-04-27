package com.newpr.optional;

import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        Integer[] ary = new Integer[10];
//        int num = ary[2].intValue();
//        System.out.println("num = " + num);

        Optional<Integer> optionalInteger = Optional.ofNullable(ary[2]);
        int num = optionalInteger.isPresent() ? optionalInteger.get() : -1;
        System.out.println("num = " + num);
    }
}
