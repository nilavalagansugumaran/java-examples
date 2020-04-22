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
        // Way 2 -
        MyFunctionalInterface<Person> personLambda = Person::saySomeThing;
        // Way 1 -
        // MyFunctionalInterface<Person> personLambda = p -> p.saySomeThing();
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

        // Invoking constructors
        ConstructorExampleInterface exampleInterface = Person::new;
        System.out.println("Default " + exampleInterface.getPerson());

        ConstructorWithParameterExampleInterface exampleInterfaceWithParams = Person::new;
        System.out.println("Actual " + exampleInterfaceWithParams.getPersonObjFor("Someone", 55));

        someTestOfPassingLambdaAsAParameter(
                10,
                20,
                (a, b) -> {
                    if (a > b) {
                        return true;
                    } else {
                        return false;
                    }
                });

        someTestOfPassingLambdaAsAParameter(
                100,
                50,
                (a, b) -> {
                    if (a > b) {
                        return true;
                    } else {
                        return false;
                    }
                });
    }

    private static <T> void someTestOfPassingLambdaAsAParameter(
            T obj1, T obj2, MyOtherFunctionalInterface<T> functionalInterface) {

        if (functionalInterface.executeOther(obj1, obj2)) {
            System.out.println("Obj1 won");
        } else {
            System.out.println("Obj2 won");
        }
    }
}

//
// class MyClass<T> implements MyFunctionalInterface<T> {
//    void execute(T a){
//
//    }
// }
