package com.example.generics;

public class CurrentAccount {

    private String balance;

    public String getBalance() {
        return balance;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }

    public CurrentAccount(String balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "CurrentAccount{" +
                "balance='" + balance + '\'' +
                '}';
    }
}
