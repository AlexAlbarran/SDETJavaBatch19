package org.example.review9;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class E4 {
    public static void main(String[] args) {

        Collection<Integer> numbers=new ArrayList();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        System.out.println(numbers);

        System.out.println(numbers);
        Collections.frequency(numbers,10);
    }
}
