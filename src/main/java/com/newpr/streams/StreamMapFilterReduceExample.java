package com.newpr.streams;

import com.newpr.funcprogramming.Instructors;

public class StreamMapFilterReduceExample {

    public static void main(String[] args) {
        Integer sum = Instructors.getAll().stream()
                .filter(instructor -> !instructor.isOnlineCourses())
                .map(instructor -> instructor.getYearsOfExperience())
                .reduce(0, Integer::sum);

        System.out.println("sum = " + sum);
    }
}
