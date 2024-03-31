package org.example.class2;

public class E5String {
    public static void main(String[] args) {
        String firstName="Alejandro";
        String lastName="Albarran";
        String city="Waukegan";
        String state="IL";
        String phoneNumber="555-555-555";
        System.out.println("My First name is "+ firstName +" and my last name is "+lastName);
        System.out.println("I live in the city "+ city +" and state "+state);
        System.out.println("And my phone number is "+phoneNumber);

        String fullName=firstName + " " + lastName;
        city="Kenosha";
        state="WI";
        phoneNumber="262-444-6666";
        System.out.println("My First name is "+ fullName +" and I moved to a new city " +city+ " and new state "+state);
        System.out.println("My new phone number is "+phoneNumber);

    }
}
