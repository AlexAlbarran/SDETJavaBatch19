package org.example.class23;

import java.util.ArrayList;

/*
Create an ArrayList that will store 5 names into it.

 */
public class Task2 {
    public static void main(String[] args) {

        ArrayList<String> cars = new ArrayList<>();
        cars.add("Ford");
        cars.add("Chevy");
        cars.add("Dodge");
        cars.add("Toyota");

        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i));
        }

        System.out.println("****************");

        for(String s:cars) {
            System.out.println(s);
        }
        cars.forEach(c-> System.out.println(c));
        cars.forEach(c-> System.out.println(c.length()));

    }
}
