package org.example.class5;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);

        System.out.println("Please enter current time in 24hr format");
        double newTime = scanner.nextDouble();

        if (newTime >= 1 && newTime <= 11) {
            System.out.println("This is morning time");
        } else if (newTime >= 12 && newTime <= 15) {
            System.out.println("This is afternoon time");
        } else if (newTime >= 16 && newTime <= 20) {
            System.out.println("This is evening time");
        } else if (newTime >= 21 && newTime <= 24) {
            System.out.println("This is night time");
        } else {
            System.out.println("Invalid input");
        }
    }
}
