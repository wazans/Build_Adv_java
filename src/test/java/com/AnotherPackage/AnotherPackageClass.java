package com.AnotherPackage;

import com.test.example.HelperClass;

public class AnotherPackageClass {
    public static void main(String[] args) {
        HelperClass helper = new HelperClass();  // Error: HelperClass has package-private access in HelperClass
        helper.displayMessage();
        //String s=helper.message;
    }
}

//public ---- available through out the project

//default --- avaialable through out the package

//private --- available through out class