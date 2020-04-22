package com.example.generics;

import java.util.ArrayList;

public class GenericsMain {

    public static void main(String[] args) {

        // Accepts any type of object - This is the problem because it is complex
        ArrayList a = new ArrayList<>();
        a.add("String");
        a.add(new Integer(100));
        a.add(200.0d);

        for(Object items : a ) {
            if(items instanceof String) {
                String s = (String) items;
            }

            if(items instanceof Integer) {
                Integer s = (Integer) items;
            }


            if(items instanceof Double) {
                Double s = (Double) items;
            }
        }

        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("String");
        // You cant add other types as it is type safe
//        stringList.add(new Integer(100));
  //      stringList.add(200.0d);

        for(String items : stringList ) {
            System.out.println(items);
        }

        ArrayList<Integer> integerList = new ArrayList<>();
    //    integerList.add("String");
        integerList.add(new Integer(100));
      //  integerList.add(200.0d);

        for(Integer items : integerList ) {
            System.out.println(items);
        }


        CurrentAccount ca = new CurrentAccount("Some balance amount");
        //Create instance for your generic
        MyGeneric<CurrentAccount> genric = new MyGeneric(ca);
        genric.printToString();


        SavingsAccount sa = new SavingsAccount("Some balance amount");
        //Create instance for your generic
        MyGeneric<SavingsAccount> genric1 = new MyGeneric(sa);
        genric1.printToString();

        MyGeneric<SavingsAccount> genric2 = new MyGeneric();
        genric2.printToString();

        printFromMain(ca);
        printFromMain(sa);
        printFromMain(null);

        printFromMain(10);

        printFromMain(null, null);
        printFromMain(10d, null);

    }

    //Generic method
    public static <T> void printFromMain(T anyObject) {

        if(anyObject !=null) {
            System.out.println(anyObject.toString());
        } else {
            System.out.println("Object is null");
        }

    }

    //Generic method with multiple parameters
    public static <T, B> void printFromMain(T firstObject, B secondObject) {

        if(firstObject !=null) {
            System.out.println(firstObject.toString());
        } else {
            System.out.println("firstObject is null");
        }

        if(secondObject !=null) {
            System.out.println(secondObject.toString());
        } else {
            System.out.println("Second Object is null");
        }

    }
}
