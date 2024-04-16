package org.example.class23;

import java.util.ArrayList;

public class E2 {
    public static void main(String[] args) {

        ArrayList<String> names=new ArrayList<>();
        names.add("James");
        names.add("Barket");
        names.add("John");
        names.add("Nikola");
        System.out.println(names);
        System.out.println(names.size());
        names.remove("John");
        System.out.println(names);
        System.out.println(names.size());
        names.remove(0);
        System.out.println(names);
        System.out.println(names.size());

        System.out.println(names.contains("John"));
        System.out.println(names.get(0));
        System.out.println(names.isEmpty());
        System.out.println(names.indexOf("John"));
        System.out.println(names.set(0,"Alex"));
        System.out.println(names);
    }
}
