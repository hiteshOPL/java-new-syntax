package com.newpr.optional;

import java.util.Optional;

public class OptionalOfEmptyExample {
    public static void main(String[] args) {
        Optional<String> stringOptional = Optional.of("Hello World");
        System.out.println("stringOptional = " + stringOptional);
        Optional<String> words = getWords();
        System.out.println("words = " + words);
    }

    public static Optional<String> getWords() {
        String[] words = new String[10];
        words[2] = "Test Optional";
        Optional<String> stringOptional = Optional.ofNullable(words[2]);
        if (stringOptional.isPresent()) {
            return stringOptional;
        } else {
            return Optional.empty();
        }
    }
}
