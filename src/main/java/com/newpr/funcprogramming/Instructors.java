package com.newpr.funcprogramming;

import java.util.Arrays;
import java.util.List;

public class Instructors {

    public static List<Instructor> getAll() {
        Instructor instructor1 = new Instructor("Mike", 10, "SD", "M", true, Arrays.asList("C++","JAVA"));
        Instructor instructor2 = new Instructor("Jenny", 20, "SD1", "F", false, Arrays.asList("PYTHON", "HTML"));
        Instructor instructor3 = new Instructor("Tom", 3, "SD2", "M", false, Arrays.asList("C","C++"));
        List<Instructor> instructorList = Arrays.asList(instructor1, instructor2, instructor3);
        return instructorList;
    }
}
