package com.test.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ImmutableCollectionsExample {
    public static void main(String[] args) {
        // Creating a mutable list
        List<String> mutableList = new ArrayList<>();
        mutableList.add("Apple");
        mutableList.add("Banana");
        mutableList.add("Cherry");

        // Creating an immutable list from the mutable one
        List<String> immutableList = Collections.unmodifiableList(mutableList);

        // Attempting to modify the immutable list will result in an UnsupportedOperationException
        // Uncommenting the following line will cause an exception
         immutableList.add("Date");

        // Print the original and immutable lists
        System.out.println("Mutable List: " + mutableList);
        System.out.println("Immutable List: " + immutableList);
    }
}
