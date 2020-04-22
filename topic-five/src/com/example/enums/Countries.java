package com.example.enums;

public class Countries  {

    private String name;
    private String capital;
    private double area;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public Countries(String name, String capital, double area) {
        this.name = name;
        this.capital = capital;
        this.area = area;
    }
//
//    @Override
//    public String toString() {
//        return super.toString();
//    }


    @Override
    public String toString() {
        return "Countries{" +
                "name='" + name + '\'' +
                ", capital='" + capital + '\'' +
                ", area=" + area +
                '}';
    }
}
