package com.newpr.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamLimitAndSkipExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);

        List<Integer> limit = numbers.stream().limit(5).collect(Collectors.toList());
        limit.forEach(System.out::println);

        System.out.println("-----------");

        List<Integer> skip = numbers.stream().skip(5).collect(Collectors.toList());
        skip.forEach(System.out::println);
    }
}
