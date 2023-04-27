package com.newpr.streams;

import com.newpr.funcprogramming.Instructor;
import com.newpr.funcprogramming.Instructors;

import java.util.Optional;

public class StreamFindAnyAndFirst {
    public static void main(String[] args) {
        Optional<Instructor> firstOptional = Instructors.getAll().stream().findFirst();
        if (firstOptional.isPresent()) {
            System.out.println("firstOptional.get() = " + firstOptional.get());
        }

        Optional<Instructor> anyOptional = Instructors.getAll().stream().findAny();
        if (anyOptional.isPresent()) {
            System.out.println("anyOptional.get() = " + anyOptional.get());
        }
    }
}
