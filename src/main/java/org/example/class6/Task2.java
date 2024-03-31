package org.example.class6;

        ///Allow user to enter grade (A, B, or C etc...) and
        //then provide explanation: A-Excellent, B-Good, C-Average, D-Bad,
        //any other grade --> Not Acceptable. At the end your program should
        //print which grade was entered by a user with explanation.

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter your grade");
        char grade = scanner.next().toLowerCase().charAt(0);

        switch (grade){
            case 'a':
                System.out.println("Excellent");
                break;
            case 'b':
                System.out.println("Good");
                break;
            case 'c':
                System.out.println("Average");
                break;
            case 'd':
                System.out.println("Bad");
                break;
            default:
                System.out.println("Not Acceptable");

        }
    }
}
