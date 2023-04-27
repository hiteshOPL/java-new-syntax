package com.newpr.funcprogramming;

import java.util.function.Predicate;

public class ConvertToMethodReferenceExample {
    public static void main(String[] args) {
        Predicate<Instructor> p2 = ConvertToMethodReferenceExample::greaterThenYearsOfExperience;

        Instructors.getAll().forEach(instructor -> {
            if (p2.test(instructor)) {
                System.out.println(instructor);
            }
        });
    }

    public static boolean greaterThenYearsOfExperience(Instructor instructor) {
        if (instructor.getYearsOfExperience() > 5) {
            return true;
        }
        return false;
    }
}
