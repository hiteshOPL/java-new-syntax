package com.newpr.funcprogramming;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample2 {
    public static void main(String[] args) {
        List<Instructor> instructors = Instructors.getAll();

        Consumer<Instructor> c1 = instructor -> System.out.println(instructor);
        instructors.forEach(c1);

        System.out.println("----------");
        Consumer<Instructor> c2 = instructor -> System.out.print(instructor.getName());
        instructors.forEach(c2);

        System.out.println("----------");
        Consumer<Instructor> c3 = instructor -> System.out.println(instructor.getCourses());
        instructors.forEach(c2.andThen(c3));

        System.out.println("----------");
        instructors.forEach(instructor -> {
            if (instructor.getYearsOfExperience() > 5) {
                c1.accept(instructor);
            }
        });

        System.out.println("----------");
        instructors.forEach(instructor -> {
            if (instructor.getYearsOfExperience() > 5 && !instructor.isOnlineCourses()) {
                c1.andThen(c2).accept(instructor);
            }
        });
    }
}
