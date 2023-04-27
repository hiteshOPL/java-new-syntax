package com.newpr.streams;

import com.newpr.funcprogramming.Instructor;
import com.newpr.funcprogramming.Instructors;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamExample {
    public static void main(String[] args) {
        Predicate<Instructor> p1 = i -> i.isOnlineCourses();
        Predicate<Instructor> p2 = i -> i.getYearsOfExperience() > 5;

        List<Instructor> list = Instructors.getAll();

        Map<String, List<String>> map = list.stream()
                                    .filter(p1)
                                    .filter(p2)
                                    .collect(Collectors.toMap(Instructor::getName, Instructor::getCourses));

        System.out.println(map);
    }
}
