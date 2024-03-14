package com.test.example;

import java.util.List;

public class StringConcatenationExample {
    public static String concatenateStrings(List<String> stringList) {
        String result = "";
        for (String str : stringList) {
            result += str;
        }
        return result;
    }

    public static void main(String[] args) {
        List<String> stringList = List.of("Hello", " ", "World", "!");
        String concatenatedString = concatenateStrings(stringList);
        System.out.println(concatenatedString);
    }
}
