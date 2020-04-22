package com.example.generics;

//Syntax - any name
public class MyGeneric<A> {


    A accountType;

    MyGeneric() {

    }

    MyGeneric(A accountType) {
        this.accountType = accountType;
    }

    void printToString() {


        if (accountType != null) {
            System.out.println(accountType.getClass());
            System.out.println(accountType.toString());
        } else {
            System.out.println("This is generic no object ");
        }
    }

}
