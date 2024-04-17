package org.example.class25;

import java.util.ArrayList;

public class E7 {
    public static void main(String[] args) {
        ArrayList<ArrayList<String>> list = new ArrayList<>();

        ArrayList<String> names = new ArrayList<>();
        names.add("Will");
        names.add("I");
        names.add("Am");
        ArrayList<String> names2 = new ArrayList<>();
        names2.add("Obama");
        names2.add("Kennedy");
        names2.add("Bush");

        list.add(names);
        list.add(names2);

        System.out.println(list);
    }
}
