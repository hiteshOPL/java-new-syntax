package com.newpr.streams;

import com.newpr.funcprogramming.Instructor;
import com.newpr.funcprogramming.Instructors;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamReduceExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        Integer sum = numbers.stream().reduce(0, (a, b) -> a + b);
        System.out.println("sum = " + sum);

        Integer miltiple = numbers.stream().reduce(1, (a, b) -> a * b);
        System.out.println("miltiple = " + miltiple);

        Optional<Integer> optionalInteger = numbers.stream().reduce((a, b) -> a + b);
        System.out.println("optionalInteger.get() = " + optionalInteger.get());


        // PRINT INSTRUCTOR WITH HIGHEST YEARS OF EXPERIENCE
        Optional<Instructor> reduce = Instructors.getAll().stream()
                .reduce((a, b) -> a.getYearsOfExperience() > b.getYearsOfExperience() ? a : b);

        System.out.println("reduce.get() = " + reduce.get());
    }
}
