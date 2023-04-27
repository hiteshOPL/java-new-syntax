package com.newpr.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamMaxExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);

        Optional<Integer> max1 = numbers.stream().max(Integer::compareTo);
        System.out.println("max1 = " + max1);

        Integer max2 = numbers.stream().reduce(0, (a, b) -> a > b ? a : b);
        System.out.println("max2 = " + max2);

        Optional<Integer> max3 = numbers.stream().reduce((a, b) -> a > b ? a : b);
        System.out.println("max3 = " + max3);

        Optional<Integer> max4 = numbers.stream().reduce(Integer::max);
        System.out.println("max4 = " + max4);
    }
}
