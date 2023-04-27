package com.newpr.lambda;

public class IncrementByFiveNew {
    public static void main(String[] args) {
        IncrementByFiveInterface incrementByFiveInterface = (a) -> a + 5;

        System.out.println(incrementByFiveInterface.incrementByFive(6));
    }
}
