package org.example.class25;

import java.util.LinkedHashSet;
import java.util.Set;

/*
Create the collection that will store single uniques Objects of a String type in which order is preserved.
Write a logic to concatenate all string from the collection.
 */
public class Task5 {
    public static void main(String[] args) {

        // Create a LinkedHashSet to store unique strings while preserving order
        Set<String> stringSet = new LinkedHashSet<>();

        // Add strings to the set
        stringSet.add("Hello");
        stringSet.add("World");
        stringSet.add("Java");
        stringSet.add("Programming");
        stringSet.add("Language");
        stringSet.add("Hello"); // Duplicate, won't be added

        // Concatenate all strings from the collection
        StringBuilder concatenatedString = new StringBuilder();
        for (String str : stringSet) {
            concatenatedString.append(str);
        }

        // Print the concatenated string
        System.out.println("Concatenated String: " + concatenatedString.toString());
    }
}
