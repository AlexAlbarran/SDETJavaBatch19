package org.example.class24;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class E4 {
    public static void main(String[] args) {

        Set<Integer> numbers=new HashSet<>();
        numbers.add(50);
        numbers.add(50);
        numbers.add(23);
        numbers.add(45);
        numbers.add(10);
        System.out.println(numbers);

        System.out.println("****************");

        for(Integer i:numbers){
            System.out.print(i);
        }
        System.out.println("****************");

        numbers.forEach(x-> System.out.print(x));

        System.out.println("****************");

        List<Integer>intergerList=new ArrayList<>(numbers);
        for (int i = 0; i < intergerList.size(); i++) {
            System.out.print(intergerList.get(i));
        }
    }
}
