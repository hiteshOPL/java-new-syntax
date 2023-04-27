package com.newpr.funcprogramming;

import java.util.function.Function;
import java.util.function.Predicate;

public class MethodReferenceExample {
    public static void main(String[] args) {
        Predicate<Instructor> p1 = i -> i.isOnlineCourses();
        Predicate<Instructor> p2 = Instructor::isOnlineCourses;

        Function<Integer, Double> sqrt = n -> Math.sqrt(n);
        Function<Integer, Double> sqrt1 = Math::sqrt;

        Function<String, String> lowerCaseFn = s -> s.toLowerCase();
        Function<String, String> lowerCaseFn1 = String::toLowerCase;


    }
}
