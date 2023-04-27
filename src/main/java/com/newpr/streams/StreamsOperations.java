package com.newpr.streams;

import com.newpr.funcprogramming.Instructor;
import com.newpr.funcprogramming.Instructors;

import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamsOperations {
    public static void main(String[] args) {

        // List
        List<String> instructorCourses = Instructors.getAll().stream()
                .map(Instructor::getCourses)
                .flatMap(Collection::stream)
                .collect(Collectors.toList());
        System.out.println(instructorCourses);

        // COUNT
        Long instructorCoursesCount = Instructors.getAll().stream()
                .map(Instructor::getCourses)
                .flatMap(Collection::stream)
                .count();
        System.out.println(instructorCoursesCount);

        // DISTINCT COUNT
        Long instructorCoursesDistinctCount = Instructors.getAll().stream()
                .map(Instructor::getCourses)
                .flatMap(Collection::stream)
                .distinct()
                .count();
        System.out.println(instructorCoursesDistinctCount);

        // DISTINCT SORTED
        List<String> instructorCoursesDistinct = Instructors.getAll().stream()
                .map(Instructor::getCourses)
                .flatMap(Collection::stream)
                .distinct()
                .sorted()
                .collect(Collectors.toList());
        System.out.println(instructorCoursesDistinct);

        // all,any,nonematch
        boolean match = Instructors.getAll().stream()
                .map(Instructor::getCourses)
                .flatMap(Collection::stream)
                .allMatch(s -> s.startsWith("A"));
        System.out.println(match);

    }
}
