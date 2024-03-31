package org.example.class5;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the quiz score:");

        double grade= scanner.nextDouble();
        if(grade>=90){
            System.out.println("Your grade is A");
        } else if (grade>=70) {
            System.out.println("Your grade is  B");
        } else if (grade>=50) {
            System.out.println("You grate is C");
        }else{
            System.out.println("you need to study more because your grade is F");
        }
    }
}
