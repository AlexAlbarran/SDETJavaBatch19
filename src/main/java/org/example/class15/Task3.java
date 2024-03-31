package org.example.class15;
/*
User
Create a method that will accept a String as a parameter and return a new String that consist only of vowels.
Method should be available inside the class only where it was declared and executed by calling it is name.
 */
public class Task3 {

    private String getVowels(String input) {

        StringBuilder vowels = new StringBuilder();

        input = input.toLowerCase();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowels.append(ch);
            }
        }
        return vowels.toString();
    }

    public static void main(String[] args) {
        // Create an instance of the VowelExtractor class


    }

}
