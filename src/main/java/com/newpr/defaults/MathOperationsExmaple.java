package com.newpr.defaults;

public class MathOperationsExmaple implements Calculator{

    public static void main(String[] args) {
        MathOperationsExmaple operations = new MathOperationsExmaple();
        System.out.println("operations.sum(5,6) = " + operations.sum(5,6));
        System.out.println("operations.divide(((5,6) = " + operations.divide(50,2));

        System.out.println("operations.subtract(10, 2) = " + operations.subtract(10, 2));
        System.out.println("Calculator.multiply(10, 2) = " + Calculator.multiply(10, 2));
    }

    @Override
    public int sum(int num1, int num2) {
        return num1 + num2;
    }

    @Override
    public int divide(int num1, int num2) {
        return num1 / num2;
    }
}
