package com.newpr.streams;

import com.newpr.funcprogramming.Instructor;
import com.newpr.funcprogramming.Instructors;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FilterExample {

    public static void main(String[] args) {
        List<Instructor> list = Instructors.getAll();
        List<Instructor> collect = list.stream().filter(instructor -> instructor.getYearsOfExperience() > 5)
                .sorted(Comparator.comparing(Instructor::getName).reversed())
                .collect(Collectors.toList());

        collect.stream().forEach(System.out::println);
    }
}
