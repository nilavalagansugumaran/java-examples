package com.example.enums;

public enum CountryEnum {

    UK("United Kingdom", "London", 2000000),
    US("United States", "Washington DC", 12000000),
    FR("France", "Paris", 8000000);


    private String name;
    private String capital;
    private double area;

    public String getName() {
        return name;
    }

    public String getCapital() {
        return capital;
    }

    public double getArea() {
        return area;
    }

    CountryEnum(String name, String capital, double area) {
        this.name = name;
        this.capital = capital;
        this.area = area;
    }


    @Override
    public String toString() {
        return super.toString();
    }

    // additional methods
    public boolean isBiggerCountry() {
        return area > 2000000;
    }
};
