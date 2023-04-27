package com.newpr.lambda;

public class HelloWorldOldWay implements HelloWorldInterface{

    @Override
    public String sayHello() {
        return "Hello World !!!";
    }

    public static void main(String[] args) {
        HelloWorldOldWay helloWorldOldWay = new HelloWorldOldWay();
        System.out.println(helloWorldOldWay.sayHello());
    }
}
