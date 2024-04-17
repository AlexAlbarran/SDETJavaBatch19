package org.example.class25;

import java.util.TreeMap;

/*
Create a map of countries(5) with its capital that will store countries in alphabetical order.
Country names will be keys and capitals will be values
Print all keys and values from a country map using for each loop or Lambda.
Print all values from a country map using for each loop or Lambda.
 */
public class Task2 {
    public static void main(String[] args) {

        TreeMap<String,String> countries=new TreeMap<>();
        countries.put("USA","Washington D.C.");
        countries.put("Mexico","Mexico City");
        countries.put("Canada","Ottawa");
        countries.put("France","Paris");
        countries.put("Germany","Berlin");

        countries.forEach((country,capital)->System.out.println("Country: "+country+", Capital: "+capital));
        countries.values().forEach(capital->System.out.println("Capital: "+capital));

    }
}
