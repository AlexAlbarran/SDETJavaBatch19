package org.example.class11;

public class E11String {
    public static void main(String[] args) {
        String str="ghisfuho$$****AUUIFLihgpfihjp!!@#$%^47935";
        System.out.println(str.replaceAll("[0-9]","*"));
        System.out.println(str.replaceAll("[a-z]",""));
        System.out.println(str.replaceAll("[A-z]",""));
        System.out.println(str.replaceAll("[A-Z]",""));
        System.out.println(str.replaceAll("[A-Z0-9]",""));
        System.out.println(str.replaceAll("[A-Za-z0-9]",""));
        System.out.println(str.replaceAll("[^A-Za-z0-9]",""));

        // ^ is the NOT operator
    }
}
