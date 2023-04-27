package com.newpr.lambda;

public class HelloWorldNewWay {
    public static void main(String[] args) {
        HelloWorldInterface helloWorldInterface = () -> {
            return "Hello World new";
        };
        System.out.println(helloWorldInterface.sayHello());
    }
}
