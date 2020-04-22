package com.example.interfaces;

public class InterfaceMain {

    public static void main(String a[]) {

            Myclass1 c1 = new Myclass1();
            c1.method1();
            c1.method1(1,2);

            //Not possible
       // MyInterface1 in1 = new MyInterface1();

        MyInterface1 in1 = new Myclass1();
        in1.method1();
        in1.method1(2,3);


        MyInterface3 in3 = new Myclass3();
        in3.method1();
        in3.method1(2,3);

        MyInterface1 in11 = new Myclass3();
        in11.method1();
        in11.method1(2,3);
    }
}

//Interface declarations
interface MyInterface1 {
    void method1();
    void method1(int param1, int param2) ;
}

interface MyInterface2 {
    void method2();
    void method2(int param1, int param2) ;
}

interface MyInterface3 extends MyInterface1,MyInterface2 {
    void method3();
    void method3(int param1, int param2) ;
}

// Implementing an interfaces
class Myclass1 implements MyInterface1 {

    @Override
    public void method1() {
        // provide implementation
    }

    @Override
    public void method1(int param1, int param2) {// provide implementation
    }
}


class Myclass2 implements MyInterface2 {

    @Override
    public void method2() {
        // provide implementation
    }

    @Override
    public void method2(int param1, int param2) {// provide implementation
    }
}


class Myclass3 implements MyInterface3 {

    @Override
    public void method1() {
        // provide implementation
    }

    @Override
    public void method1(int param1, int param2) {// provide implementation
    }

    @Override
    public void method2() {
        // provide implementation
    }

    @Override
    public void method2(int param1, int param2) {// provide implementation
    }

    @Override
    public void method3() {
        // provide implementation
    }

    @Override
    public void method3(int param1, int param2) {// provide implementation
    }
}