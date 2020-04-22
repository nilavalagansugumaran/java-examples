package com.example.enums;

public class Example {

    // Example constant
    public static final String NAME = "nila";
}

class OtherClass{

    void print() {
        //Usage of constant
        System.out.println(Example.NAME);
    }
}