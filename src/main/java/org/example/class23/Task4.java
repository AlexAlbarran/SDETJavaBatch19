package org.example.class23;

import java.util.ArrayList;

public class Task4 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        for (int i = 0; i <=500; i=i+2) {
            numbers.add(i);
        }
        System.out.println(numbers);
        numbers.removeIf(c->c%5==0);
        System.out.println(numbers);
    }
}
