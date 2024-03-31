package org.example.class5;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your age");
        int age = scanner.nextInt();
        if (age >= 18) {
            System.out.println("You get a license");
        } else {
            System.out.println("You will get a Learners permit");
        }
    
    }
}
