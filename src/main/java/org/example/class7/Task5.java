package org.example.class7;

public class Task5 {
    public static void main(String[] args) {

        // create an array of animals and store 5 elements into it.
        // Using2 different loops print all elements from the array.
        String[] animals = {"Goat", "Horse", "Dog", "Cat", "Mouse"};

        int i = 0;
        while (i < 5) {
            System.out.println(animals[i]);
            i++;
        }
        for (String n : animals) {
            System.out.println(n);

        }
    }
}
