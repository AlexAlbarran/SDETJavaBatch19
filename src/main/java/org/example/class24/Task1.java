package org.example.class24;
/*
Create a Set in which you need to add names of the countries(5).
In this set we want all objects to be sorted in alphabetical order. retrieve all elements from set.
 */
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Task1 {
    public static void main(String[] args) {
        List<String> aList=new ArrayList<>();
        aList.add("John");
        aList.add("Jane");
        aList.add("James");
        aList.add("Jasmine");
        aList.add("Jane");
        aList.add("James");

        Set<String> noDuplicates = new HashSet<>(aList);
        System.out.println(noDuplicates);
    }
}
