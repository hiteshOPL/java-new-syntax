package com.newpr.funcprogramming;

import java.util.List;
import java.util.function.Predicate;

public class PredicateExample2 {
    public static void main(String[] args) {

        Predicate<Instructor> p1 = instructor -> instructor.isOnlineCourses() == true;
        Predicate<Instructor> p2 = instructor -> instructor.getYearsOfExperience() > 5;

        List<Instructor> instructors = Instructors.getAll();

        instructors.forEach(instructor -> {
            if (p1.test(instructor)) {
                System.out.println(instructor);
            }
        });
        System.out.println("---------------------");
        instructors.forEach(instructor -> {
            if (p1.and(p2).test(instructor)) {
                System.out.println(instructor);
            }
        });
    }
}
