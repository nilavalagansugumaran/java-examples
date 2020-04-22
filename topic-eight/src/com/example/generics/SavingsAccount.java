package com.example.generics;

public class SavingsAccount {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SavingsAccount(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "SavingsAccount{" +
                "name='" + name + '\'' +
                '}';
    }
}
