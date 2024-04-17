package org.example.class24;

import java.util.LinkedList;

public class CatTester {
    public static void main(String[] args) {

        LinkedList<Cat> cats=new LinkedList<>();
        Cat cat1 = new Cat("Whiskers", "Gray", 3);
        Cat cat2 = new Cat("Mittens", "White", 5);
        Cat cat3 = new Cat("Smokey", "Black", 2);

        cats.add(cat1);
        cats.add(cat2);
        cats.add(cat3);
        cats.forEach(x->x.printInfo());
    }
}
