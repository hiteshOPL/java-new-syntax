package com.newpr.streams;

import com.newpr.funcprogramming.Instructor;
import com.newpr.funcprogramming.Instructors;

import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FlatMapExample {
    public static void main(String[] args) {
        List<String> instructorCourses = Instructors.getAll().stream()
                .map(Instructor::getCourses)
                .flatMap(Collection::stream)
                .collect(Collectors.toList());

        Set<String> instructorCoursesSet = Instructors.getAll().stream()
                .map(Instructor::getCourses)
                .flatMap(Collection::stream)
                .collect(Collectors.toSet());
        System.out.println(instructorCourses);
        System.out.println(instructorCoursesSet);
    }
}
