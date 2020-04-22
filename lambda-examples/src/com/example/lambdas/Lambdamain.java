package com.example.lambdas;

public class Lambdamain {

    public static void main(String s[]) {

        // Multi line
        MyFunctionalInterface<String> stringLambda1 =
                (p) -> {
                    System.out.println("Input string  is" + p);
                    System.out.println("Length of the string " + p.length());
                };
        stringLambda1.execute("This is my first String");

        // Single line
        MyFunctionalInterface<String> stringLambda2 =
                p -> System.out.println("Length of the string " + p.length());
        stringLambda2.execute("This is my seconds string 11111111");

        // Passing object and invoking method
        MyFunctionalInterface<Person> personLambda = p -> p.saySomeThing();
        personLambda.execute(new Person("my son", 11));
        personLambda.execute(new Person("Nila", 17));

        // Passing multiple parameters and returning value
        MyOtherFunctionalInterface<Integer> integerLambda =
                (p, q) -> {
                    if (p > q) {
                        return true;
                    } else {
                        return false;
                    }
                };

        System.out.println("is 10 > 20" + integerLambda.executeOther(10, 20));
        System.out.println("is 30 > 10" + integerLambda.executeOther(30, 10));

        // Passing multiple parameters and returning value
        MyOtherFunctionalInterface<Person> personComapreLambda =
                (a, b) -> {
                    if (a.getAge() > b.getAge()) {
                        return true;
                    } else {
                        return false;
                    }
                };

        System.out.println(
                "is nila is older then son "
                        + personComapreLambda.executeOther(
                                new Person("Nila", 17), new Person("my son", 11)));

        System.out.println(
                "is nila is older then his dad "
                        + personComapreLambda.executeOther(
                                new Person("Nila", 17), new Person("my dad", 65)));
    }
}
//
// class MyClass<T> implements MyFunctionalInterface<T> {
//    void execute(T a){
//
//    }
// }
