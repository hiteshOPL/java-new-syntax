package com.newpr.funcprogramming;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;

public class BiPredicateExample {
    public static void main(String[] args) {
        List<Instructor> instructors = Instructors.getAll();

        BiPredicate<Boolean, Integer> p1 = (online, experience) -> online == false && experience > 5;

        BiConsumer<String, List<String>> biConsumer = (name, courses) -> System.out.println("name is: " + name + " and corses : " + courses);
        instructors.forEach(instructor -> {
            if (p1.test(instructor.isOnlineCourses(), instructor.getYearsOfExperience())) {
                biConsumer.accept(instructor.getName(), instructor.getCourses());
            }
        });
    }
}
