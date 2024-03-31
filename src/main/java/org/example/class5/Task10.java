package org.example.class5;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number:");
        int number= scanner.nextInt();
        if(number>=1 && number<=10){
            System.out.println("This number is Small.");
        } else if (number>=11 && number <=100) {
            System.out.println("This number is Medium.");
        } else if (number>=101 && number <=1000) {
            System.out.println("This number is large");
        }
    }
}
