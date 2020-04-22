package com.example.lambdas;

public class Lambdamain {

    public static void main(String s[]){

        //Multi line
        MyFunctionalInterface<String> stringLambda1 = (p) ->{
            System.out.println("Input string  is" + p);
            System.out.println("Length of the string " + p.length());

        };
        stringLambda1.execute("This is my first String");

        //Single line
        MyFunctionalInterface<String> stringLambda2 = p -> System.out.println("Length of the string " + p.length());
        stringLambda2.execute("This is my seconds string 11111111");

        MyFunctionalInterface<Person> personLambda = p ->  p.saySomeThing();
        personLambda.execute(new Person("my son", 11));
        personLambda.execute(new Person("Nila", 17));

    }
}
//
//class MyClass<T> implements MyFunctionalInterface<T> {
//    void execute(T a){
//
//    }
//}