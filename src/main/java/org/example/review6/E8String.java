package org.example.review6;

public class E8String {
    public static void main(String[] args) {

        String str="I am Nikola. I smoke. I fear my wife";
        String [] arr = str.split("[.]"); // everything splits at the period (.)
        System.out.println(arr[1].trim());

    }
}

