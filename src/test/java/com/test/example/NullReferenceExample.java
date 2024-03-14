package com.test.example;

public class NullReferenceExample {
    public static void main(String[] args) {
        // Demonstrating NullPointerException with a null reference
        String name = "test";

        try {
            int length = name.length(); // This line will throw NullPointerException
            System.out.println("Length of name: " + length);
        } catch (NullPointerException e) {
            System.err.println("NullPointerException caught: " + e.getMessage());
            e.printStackTrace(); // or log the exception
        }
        finally {
            System.out.println("Cleanup code executed whether an exception occurred or not");
        }

        // Another example with a method that may return null
        String result = getResult();
        System.out.println("Result: " + result); // This line may throw NullPointerException
    }

    // A method that may return null without a clear reason
    private static String getResult() throws RuntimeException {
        return null;

    }
}
