package com.test.example;

import java.util.List;

public class StringBuilderExample {
    public static String concatenateStrings(List<String> stringList) {
        StringBuilder result = new StringBuilder();
        for (String str : stringList) {
            result.append(str);
        }
        return result.toString();
    }

    public static void main(String[] args) {
        List<String> stringList = List.of("Hello", " ", "World", "!");
        String concatenatedString = concatenateStrings(stringList);
        System.out.println(concatenatedString);
    }
}
