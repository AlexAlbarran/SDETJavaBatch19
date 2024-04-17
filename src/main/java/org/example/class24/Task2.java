package org.example.class24;
/*
Create a Set of cities in which you want to make sure that insertion order is maintained.
Then remove any city that starts with "A";
 */
import java.util.Set;
import java.util.TreeSet;

public class Task2 {
    public static void main(String[] args) {
        Set<String> countries = new TreeSet<>();

        countries.add("France");
        countries.add("USA");
        countries.add("Spain");
        countries.add("Egypt");
        countries.add("India");
        System.out.println(countries);


    }
}
