package org.example.class23;

import java.util.ArrayList;

public class Task3 {
    public static void main(String[] args) {

        ArrayList<String> drinks=new ArrayList<>();
        drinks.add("Pepsi");
        drinks.add("Sprite");
        drinks.add("Milk");
        drinks.add("Lemonade");
        drinks.add("Coffee");

        drinks.forEach(x-> System.out.print(x+" "));

        for (int i = 0; i < drinks.size(); i++) {
            String gulp = drinks.get(i);

            if (gulp.contains("a") || gulp.contains("e")){
                drinks.set(i,"water");
            }
        }
        System.out.println();
        drinks.forEach(x-> System.out.print(x+" "));
    }
}
