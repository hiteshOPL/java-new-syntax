package com.newpr.funcprogramming;

import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerExample2 {
    public static void main(String[] args) {
        List<Instructor> instructors = Instructors.getAll();

        BiConsumer<String, String> biConsumer = (name, gender) -> System.out.println("name is : " + name +
                " and gender is : " + gender);

        instructors.forEach(instructor -> biConsumer.accept(instructor.getName(), instructor.getGender()));

        System.out.println("---------------");
        BiConsumer<String, List<String>> biConsumer1 = (name, course) -> System.out.println("name is : " + name +
                " and course is : " + course);

        instructors.forEach(instructor -> biConsumer1.accept(instructor.getName(), instructor.getCourses()));

        System.out.println("---------------");
        instructors.forEach(instructor -> {
            if (instructor.isOnlineCourses()) {
                biConsumer.accept(instructor.getName(), instructor.getGender());
            }
        });
    }
}
