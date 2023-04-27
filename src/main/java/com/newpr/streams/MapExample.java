package com.newpr.streams;

import com.newpr.funcprogramming.Instructor;
import com.newpr.funcprogramming.Instructors;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class MapExample {
    public static void main(String[] args) {
        List<String> instructorNames = Instructors.getAll().stream()
                .map(Instructor::getName)
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        Set<String> instructorNamesSet = Instructors.getAll().stream()
                .map(Instructor::getName)
                .map(String::toUpperCase)
                .collect(Collectors.toSet());
        System.out.println(instructorNames);
        System.out.println(instructorNamesSet);
    }
}
