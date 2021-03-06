package com.example.lambdas;

public class Person {

    private String name;
    private int age;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {
        this.name = "Unknown";
        this.age = -10;
    }

    public void saySomeThing() {

        if(age < 16) {
            System.out.println("Cant drive a car - " + name);
        } else {
            System.out.println("Here is the key.. - " + name);
        }

    }
}
