package com.test.example;

public class AccessTest {
    // Non-static field
    private int nonStaticField = 42;
    // Non-static method
    public void nonStaticMethod() {
        System.out.println("Non-static method called. Value of nonStaticField: " + nonStaticField);
    }
    public static void StaticMethod() {
        System.out.println("static method called");
    }
    public static void main(String[] args) {
        // Calling the static method
        //nonStaticMethod();
        //Calling the static method from a  static member by creating an instance
        AccessTest obj=new AccessTest();
        obj.nonStaticMethod();
        StaticMethod();
    }




}
