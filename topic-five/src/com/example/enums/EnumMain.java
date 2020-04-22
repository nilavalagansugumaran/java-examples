package com.example.enums;

public class EnumMain {

    public static void main(String arg[]) {

        // Normal creation of object
        Countries uk = new Countries("United Kingdom", "London", 2000000);
        Countries us = new Countries("United States", "Washington DC", 8000000);
        Countries fr = new Countries("France", "Paris", 3000000);

        System.out.println("UK == " + uk.toString());
        System.out.println("US == " + us.toString());
        System.out.println("FR == " + fr.toString());

        // How to refer to constant
        System.out.println("UK Enum == " + CountryEnum.UK.toString());
        System.out.println("US Enum == " + CountryEnum.US.toString());
        System.out.println("FR Enum == " + CountryEnum.FR.toString());

        CountryEnum frEnum = CountryEnum.FR;

        System.out.println("Is UK big?? " + CountryEnum.UK.isBiggerCountry());

        System.out.println("Which row in the table - France ?? " + frEnum.ordinal());

        System.out.println("Capital city of US??? " + CountryEnum.US.getCapital());
        // You cant construct the object anywhere
        //CountryEnum newEnum = new CountryEnum();
    }
}

enum Directions {

    NORTH,
    EAST,
    WEST,
    SOUTH;
}