package com.newpr.optional;

import java.util.Optional;

public class OptionalIsIfExample {
    public static void main(String[] args) {
        Optional<String> stringOptional = Optional.ofNullable("Hello World!!!");

        if (stringOptional.isPresent()) {
            System.out.println("stringOptional = " + stringOptional);
        }
        
        stringOptional.ifPresent(s -> System.out.println("s = " + s));
    }
}
