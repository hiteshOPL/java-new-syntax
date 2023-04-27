package com.newpr.funcprogramming;

import java.util.Arrays;

public class ConstructorReferenceExample {
    public static void main(String[] args) {
        InstructorFactory instructorFactory = Instructor::new;
        Instructor instructor = instructorFactory.getInstructor("Mike", 10, "SDE", "M", true, Arrays.asList("C", "JAVA"));
        System.out.println(instructor);
    }
}
