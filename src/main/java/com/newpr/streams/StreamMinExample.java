package com.newpr.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamMinExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);

        Optional<Integer> min1 = numbers.stream().min(Integer::compareTo);
        System.out.println("min1 = " + min1);

        Integer min2 = numbers.stream().reduce(0, (a, b) -> a < b ? a : b);
        System.out.println("min2 = " + min2);

        Optional<Integer> min3 = numbers.stream().reduce((a, b) -> a < b ? a : b);
        System.out.println("min3 = " + min3);

        Optional<Integer> min4 = numbers.stream().reduce(Integer::min);
        System.out.println("min4 = " + min4);
    }
}
